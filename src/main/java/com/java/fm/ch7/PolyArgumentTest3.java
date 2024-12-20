package com.java.fm.ch7;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer373 b = new Buyer373();
        Tv373 tv = new Tv373();
        Computer373 computer = new Computer373();
        Audio373 audio = new Audio373();
        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.summary();
        System.out.println("===========");
        b.refund(computer);
        b.summary();
    }
}
class Product373 {
    int price;
    int bonusPoint;
    Product373(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product373() {
        price = 0;
        bonusPoint = 0;
    }
}
class Tv373 extends Product373 {
    Tv373() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer373 extends Product373 {
    Computer373() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio373 extends Product373 {
    Audio373() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer373 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();         // 구입한 제품을 저장할 벡터 객체. (동적 배열, 내부적으로 Object 타입의 배열.)
    void buy(Product373 p) {
        if (money < p.price) {
            System.out.println("잔액 부족. 구입 못함.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입함.");
    }
    void refund(Product373 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품.");
        } else {
            System.out.println("구입한 제품 중 해당 제품은 없음.");
        }
    }
    void summary() {
        int sum = 0;
        String itemList = "";
        if (item.isEmpty()) {
            System.out.println("구입한 제품이 없음.");
            return;
        }
        for (int i = 0; i < item.size(); i++) {
            Product373 p = (Product373) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구매한 물품의 총금액은 : " + sum);
        System.out.println("구매한 제품 : " + itemList);
    }
}

