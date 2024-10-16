package com.java.fm.ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000) / 1000.0;    // 곱셈 -> 형변환 -> 나눗셈 순서로 연산.
        System.out.println("shortPi = " + shortPi);
    }
}
