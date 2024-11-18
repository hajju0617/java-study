package com.java.fm.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0L;
        int[] score = {100, 88, 90, 100, 100};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (double) (score.length);    // 명시적 형변환 (int / int = int타입이라 double로 형변환)
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
