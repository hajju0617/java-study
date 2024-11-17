package com.java.fm.ch5;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;
        score[3] = 80;
        score[4] = 90;
        int tmp = score[k + 2] + score[4];

        System.out.println("일반 for문");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("score[%d] = %d%n", i, score[i]);
        }

        System.out.println("===========");

        System.out.println("향상된 for문");
        for (int i : score) {
            System.out.println(i);
        }
        System.out.println("tmp = " + tmp);

//        System.out.printf("score[%d] = %d%n", 5, score[5]);
        // 배열의 인덱스 범위를 초과해버림. (ArrayIndexOutOfBoundsException 발생)
    }
}
