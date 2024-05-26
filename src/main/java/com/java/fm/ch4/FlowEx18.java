package com.java.fm.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        int j;
        for (int i = 1; i <= 9; i++) {
            for (j = 2; j <= 9; j++) {
                System.out.printf("%2d x %d = %-2d", j, i, i * j);
            }
            System.out.println();
        }
    }
}
