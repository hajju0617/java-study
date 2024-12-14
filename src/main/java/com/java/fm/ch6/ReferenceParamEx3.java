package com.java.fm.ch6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 7, 8, 9};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        int count = 0;
        for (int i : arr) {
            System.out.print(i);
            count++;
            if (count < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {        // 버블 정렬.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }   // for (j)
        }   // for (i)
    }
}
