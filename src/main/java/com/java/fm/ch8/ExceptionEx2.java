package com.java.fm.ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100, result = 0;
        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.java.fm.ch8.ExceptionEx2.main(ExceptionEx2.java:7) -> 7번 라인.
        // 에러 발생.
    }
}
