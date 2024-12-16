package com.java.fm.ch6;

import org.w3c.dom.ls.LSOutput;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(5, 5) = " + mm.add(5, 5));
        System.out.println("mm.add(5L, 5L) = " + mm.add(5L, 5L));
        System.out.println("mm.add(5L, 5) = " + mm.add(5L, 5));
        System.out.println("mm.add(5, 5L) = " + mm.add(5, 5L));
        int[] arr = {100, 200, 300};
        System.out.println("mm.add(arr) = " + mm.add(arr));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) : ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) : ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) : ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) : ");
        return a + b;
    }

    int add(int[] arr) {
        System.out.print("int add(int[] arr) : ");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}