package com.java.fm.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // round 메서드는 매개변수 값을 소수점 첫째자리에서 반올림하고 그 결과를 정수로 반환.
        System.out.println("shortPi = " + shortPi);
    }
}
