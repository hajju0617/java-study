package com.java.fm.ch7;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer371 b = new Buyer371();
        b.buy(new Tv373());
        b.buy(new Computer373());
        b.buy(new Audio373());
        b.summary();
    }
}
class Product371 {
    int price;
    int bonusPoint;
    Product371(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product371() {  }
}
class Tv371 extends Product373 {
    Tv371() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer371 extends Product373 {
    Computer371() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio371 extends Product373 {
    Audio371() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer371 {
    int money = 1000;
    int bonusPoint = 0;
    Product373[] item = new Product373[10];     // 구입한 제품을 저장할 배열.
    int counter;                                // counter는 구매된 제품의 개수
    void buy(Product373 p) {
        if (money < p.price) {
            System.out.println("잔액 부족. 구입 못함.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[counter++] = p;
        System.out.println(p + "을/를 구입함.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
//            if (i < counter - 1) {
//                itemList += item[i] + ", ";     // 자바에서는 객체와 문자열(String)을 더할 때, 자동으로 객체의 toString() 메서드를 호출함.
//            } else {
//                itemList += item[i];
//            }
            itemList += (i == 0) ? "" + item[i] : ", " + item[i];   // 자바에서는 객체와 문자열(String)을 더할 때, 자동으로 객체의 toString() 메서드를 호출함.
        }
        System.out.println("구매한 물품의 총금액은 -> " + sum);
        System.out.println("구매한 제품 : " + itemList);
    }
}