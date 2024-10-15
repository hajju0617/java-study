package com.java.fm.ch2;

import com.java.fm.ch6.Tv;

import java.util.ArrayList;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x = " + x + ", y = " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x + ", y = " + y);

        char c = 'A';
        System.out.printf("A = %d", (int) c);

    }
}
