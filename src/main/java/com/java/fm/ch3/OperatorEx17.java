package com.java.fm.ch3;

public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;      // 반올림을 위해 0.5 더해줌.
        System.out.println("shortPi = " + shortPi);
    }
}
