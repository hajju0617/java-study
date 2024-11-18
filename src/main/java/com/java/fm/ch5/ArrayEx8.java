package com.java.fm.ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[46];

        for (int i = 1; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int temp = 0;
        int range = 45;
        for (int i = 1; i < range; i++) {
            int j = (int) (Math.random() * 45) + 1;
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        for (int i = 1; i < 7; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
