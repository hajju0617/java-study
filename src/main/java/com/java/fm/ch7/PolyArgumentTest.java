package com.java.fm.ch7;

public class PolyArgumentTest {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
////        Tv tv = new Tv();
////        b.buy(tv);
//        b.buy(new Computer());
//
//        System.out.printf("현재 남은 돈은 %d 만원입니다.\n", b.money);
//        System.out.printf("현재 보너스 포인트는 %d 점 입니다.\n", b.bonusMoney);
//    }

}

//class Product {
//    int price;
//    int bonusPoint;
//    Product(int price) {
//        this.price = price;
//        this.bonusPoint = (int)(price / 10.0);
//    }
//}
//
//class Tv extends Product {
//    Tv() {
//        super(100);
//    }
//    public String toString() { return "Tv"; }
//}
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//    public String toString() { return "Computer"; }
//}
//class Buyer {
//    int money = 1000;
//    int bonusMoney = 0;
//
//    void buy(Product p) {
//        if(money < p.price) {
//            System.out.println("잔액이 부족하여 물건을 살 수 없음");
//            return;
//        }
//        money -= p.price;
//        bonusMoney += p.bonusPoint;
//        System.out.println(p + "을/를 구입했다.");
//    }
//}