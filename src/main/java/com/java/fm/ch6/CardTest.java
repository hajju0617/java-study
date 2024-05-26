package com.java.fm.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card width : " + Card.width);
        System.out.println("Card height : " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.printf("c1의 무늬는 %s이며 숫자는 %d이고 크기는 (%d,%d) 입니다.\n"
                ,c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 무늬는 %s이며 숫자는 %d이고 크기는 (%d,%d) 입니다.\n\n"
                , c2.kind, c2.number, c2.width, c2.height);
        System.out.println("c1의 width와 height를 각각 50,80으로 변경 합니다.\n");
        c1.width = 50;
        c1.height = 80;
        System.out.printf("c1의 무늬는 %s이며 숫자는 %d이고 크기는 (%d,%d) 입니다.\n"
                ,c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 무늬는 %s이며 숫자는 %d이고 크기는 (%d,%d) 입니다.\n"
                , c2.kind, c2.number, c2.width, c2.height);
    }
}

class Card {
    static int width = 100;
    static int height = 250;
    String kind;
    int number;
}