package com.java.fm.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer368 b = new Buyer368();
        b.buy(new Tv368());
        b.buy(new Computer368());
        System.out.println("현재 남은 돈은 " + b.money + "만원.");
        System.out.println("현재 보너스 점수는 : " + b.bonusPoint);
    }
}
class Product368 {
    int price;
    int bonusPoint;             // 제품 구매시 주는 보너스 포인트.
    Product368(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}
class Tv368 extends Product368 {
    Tv368() {
        super(100);
    }
    public String toString() {      // Object 클래스의 toString 오버라이딩.
        return "Tv";
    }
}
class Computer368 extends Product368 {
    Computer368() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Buyer368 {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product368 p) {
        if (money < p.price) {
            System.out.println("잔액 부족. 구입할 수 없음.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "을/를 구입함.");
    }
}