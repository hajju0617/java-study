package com.java.fm.ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank392 tank = new Tank392();
        Dropship392 dropship = new Dropship392();
        Marine392 marine = new Marine392();
        SCV392 scv = new SCV392();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}
interface Repairable392 {

}
class Unit392 {
    int hitPoint;
    final int MAX_HP;
    Unit392(int hp) {
        MAX_HP = hp;
    }
}
class GroundUnit392 extends Unit392 {
    GroundUnit392(int hp) {
        super(hp);
    }
}
class AirUnit392 extends Unit392 {
    AirUnit392(int hp) {
        super(hp);
    }
}

class Tank392 extends GroundUnit392 implements Repairable392 {
    Tank392() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class Marine392 extends GroundUnit392 {
    Marine392() {
        super(40);
        hitPoint = MAX_HP;
    }
}
class Dropship392 extends AirUnit392 implements Repairable392 {
    Dropship392() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}
class SCV392 extends GroundUnit392 implements Repairable392 {
    SCV392() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable392 r) {
            /*
                r의 타입은 Repairable392 (인터페이스)이지만 참조하고 있는 실제 객체는 Tank, Dropship임.
                r의 참조 타입이 Repairable392로 지정되어 있으므로 자바는 r이 무조건 Unit392를 상속한 객체임을 보장하지 못함.
            */
        if (r instanceof Unit392) {
            /*
            if (r instanceof Unit)에서 r은 Repairable 인터페이스 타입의 참조변수이지만
            instanceof 연산자는 변수의 실제 인스턴스 타입을 확인함.
            따라서 r이 Unit 클래스 또는 Unit 을 상속받는 어떤 클래스의 인스턴스일 경우 이 조건은 true 가 됨
             */
            Unit392 u = (Unit392) r;
            /*
            Unit u = r; 이 코드에서 오류가 발생하는 이유는
            Repairable 인터페이스 타입의 참조변수 r을 Unit (클래스) 타입으로 자동 형변환할 수 없기 때문
            클래스 타입으로 형변환을 하려면 명시적 형변환이 필요.
            정확하게 따져보면
            (instanceof로 안전성 확인)
            Repairable392와 Unit392 사이에 직접적인 상속 관계가 없으므로 안전성을 보장하기 위해 형변환을 명시.
             */
            while(u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났음.");
        }
    }
}