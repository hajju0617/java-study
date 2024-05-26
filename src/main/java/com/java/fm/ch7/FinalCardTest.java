package com.java.fm.ch7;

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
        Card c2 = new Card(10, "Heart");
        System.out.println(c2);
    }
}

class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 200;

    public Card(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }
    Card() {
        this(1, "Heart");
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }


}
