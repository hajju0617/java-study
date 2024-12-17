package com.java.fm.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card320 c = d.pick(0);          // 첫 카드 뽑음.
        System.out.println(c.toString());

        d.shuffle();
        c = d.pick(0);
        System.out.println(c.toString());
    }
}
class Card320 {
    static final int KIND_MAX = 4;  // 카드 무늬 수.
    static final int NUM_MAX = 13;  // 무늬 별 카드 수.
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card320() {
        this(SPADE, 1);
    }
    Card320(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        String[] kinds = {"", "SPADE", "DIAMOND", "HEART", "CLOVER"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
class Deck {
    final int CARD_NUM = 52;                        // 카드 개수.
    Card320[] cardArr = new Card320[CARD_NUM];

    Deck() {
        int i = 0;
        for (int j = Card320.KIND_MAX; j > 0; j--) {
            for (int k = 0; k < Card320.NUM_MAX; k++) {
                cardArr[i++] = new Card320(j, k + 1);
            }
        }
    }
    Card320 pick(int index) {
        return cardArr[index];
    }
    Card320 pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card320 temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}
