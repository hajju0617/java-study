package com.java.fm.ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("변경전");
        System.out.println("arr.length : " + arr.length);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

        System.out.println("변경 후");
        int[] arr2 = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr = arr2;
        System.out.println("arr.length : " + arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
