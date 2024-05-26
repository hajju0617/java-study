package com.java.fm.ch7;

public class PolyArgumentTest2 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
//        b.buy(new Computer());
//        b.buy(new Audio());
//        b.summary();
//
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
//class Tv extends Product {
//    Tv() {
//        super(100);
//    }
//    @Override
//    public String toString() { return "Tv"; }
//}
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//    @Override
//    public String toString() { return "Computer"; }
//}
//class Audio extends Product {
//    Audio() {
//        super(50);
//    }
//    @Override
//    public String toString() { return "Audio"; }
//}
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//    Product[] item = new Product[10];
//    int i = 0;
//
//    void buy(Product p) {
//        if(money < p.price) {
//            System.out.println("잔액이 부족하여 물건을 살 수 없음");
//            return;
//        }
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//        item[i++] = p;
//        System.out.println(p + "을/를 구매했다.");
//    }
//    void summary() {
//        int sum = 0;
//        String itemList = "";
//
//        for(int i = 0; i < item.length; i++) {
//            if(item[i] == null) {
//                break;
//            }
//            sum += item[i].price;
//            itemList += item[i] + ", ";
//        }
//        System.out.printf("구입하신 물품의 총금액은 %d만원 입니다.\n", sum);
//        System.out.printf("구입하신 제품은 %s입니다.\n", itemList);
//    }
//}
