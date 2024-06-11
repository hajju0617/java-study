package com.java.fm.ch8;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(4);
            System.out.println(0/0);
            System.out.println(5);
            System.out.println(6);
        } catch (ArithmeticException ae) {
            System.out.println("에러발생");

        }


        System.out.println(7);


    }
}
