package com.java.fm.ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        System.out.println("=================");

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;       // 배열 numArr[i]에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1씩 증가.
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d의 개수 : %d%n", i, counter[i]);
        }
    }
}
