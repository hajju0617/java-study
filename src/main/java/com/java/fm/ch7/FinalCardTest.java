package com.java.fm.ch7;

public class FinalCardTest {
    public static void main(String[] args) {
        Card346 card1 = new Card346();
        Card346 card2 = new Card346(5, "HEART");
//        card1.NUMBER = 5;     // final이므로 에러 발생.
        System.out.println("card2.NUMBER = " + card2.NUMBER);
        System.out.println("card2.KIND = " + card2.KIND);
        System.out.println(card1.toString());
    }
}

class Card346 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card346(int num, String kind) {     // final 상수 초기화 역할.
        this.NUMBER = num;
        this.KIND = kind;
    }
    Card346() {
        this(1, "KING");
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}

