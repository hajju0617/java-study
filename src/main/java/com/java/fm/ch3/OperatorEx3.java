package com.java.fm.ch3;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println("i++ = " + i++);
        System.out.println("++j = " + ++j);
        System.out.println("i = " + i + ", j = " + j);

        int x = 5;
        x = x++ - ++x;
        System.out.println(x);
    }
}
