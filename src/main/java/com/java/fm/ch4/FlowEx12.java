package com.java.fm.ch4;

public class FlowEx12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("i = " + i);
            if (i != 5) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
