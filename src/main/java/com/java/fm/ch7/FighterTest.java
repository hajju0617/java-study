package com.java.fm.ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter383 f = new Fighter383();
        if (f instanceof Unit383) {
            System.out.println("f는 Unit383의 자손");
        }
        if (f instanceof Fightable383) {
            System.out.println("f는 Fightable383을 구현했음");
        }
        if (f instanceof Movable383) {
            System.out.println("f는 Movable383을 구현했음");
        }
        if (f instanceof Attackable383) {
            System.out.println("f는 Attackable383을 구현했음");
        }
        if (f instanceof Object) {
            System.out.println("f는 Object의 자손");
        }
    }
}

class Fighter383 extends Unit383 implements Fightable383 {
    public void move(int x, int y) {        // 오버라이딩할 때 -> 조상의 메서드보다 더 넓은 범위의 접근 제어자 사용해야됨.

    }
    public void attack(Unit383 u) {

    }
}
class Unit383 {
    int currentHP;
    int x, y;
}
interface Movable383 {
    void move(int x, int y);        // 앞에 public abstract 생략되어 있음.
}
interface Attackable383 {
    void attack(Unit383 u);
}
interface Fightable383 extends Movable383, Attackable383 {

}