package com.java.fm.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {55, 79, 88, 91, 33, 100, 95, 28, 83};
        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
