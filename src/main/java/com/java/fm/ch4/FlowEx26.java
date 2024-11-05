package com.java.fm.ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        while ((sum += ++i) <= 100) {

            System.out.println(i + ", " + sum);
        }
    }
}
