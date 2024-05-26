package com.java.fm.ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}

interface Repairable {}

class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        if (r instanceof Unit) {
            /*
            if (r instanceof Unit)에서 r은 Repairable 인터페이스 타입의 참조변수이지만
            instanceof 연산자는 변수의 실제 인스턴스 타입을 확인함.
            따라서 r이 Unit 클래스 또는 Unit 을 상속받는 어떤 클래스의 인스턴스일 경우 이 조건은 true 가 됨
             */
            Unit u = (Unit) r;
            /*
            Unit u = r; 이 코드에서 오류가 발생하는 이유는
            Repairable 인터페이스 타입의 참조변수 r을 Unit (클래스) 타입으로 자동 형변환할 수 없기 때문
            클래스 타입으로 형변환을 하려면 명시적 형변환이 필요
             */
            while(u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다");
        }

    }
}