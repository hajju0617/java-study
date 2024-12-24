package com.java.fm.ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100, result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                int num = (int) (Math.random() * 10);
                System.out.println("num = " + num);
                result = number / num;
                System.out.println("result = " + result);
            } catch (ArithmeticException ae) {
                System.out.println("예외 발생.");
            }
        }
    }
}


