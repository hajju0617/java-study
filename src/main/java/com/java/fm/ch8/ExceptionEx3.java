package com.java.fm.ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        try {
            for(int i = 0; i < 10; i++) {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("에러 발생");
        }

    }
}
