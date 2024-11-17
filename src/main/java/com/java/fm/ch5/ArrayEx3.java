package com.java.fm.ch5;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("== 변경전 ==");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] tmp = new int[arr.length * 2];        // 배열은 생성과 동시에 각 요소를 배열의 타입의 기본값으로 초기화.
        for (int i = 0; i < arr.length; i++) {      // int[] 이므로 기본값 0으로 초기화 시켜줌.
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println("== 변경후 ==");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
