package com.java.fm.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("==========================");

        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        for (int num : numArr) {
            System.out.println("num = " + num);
        }
    }
}

