package com.java.fm.ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i < 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.printf("%d번째 에러 발생\n", i+1);
            }
        } // for 끝
    }
}
