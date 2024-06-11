package com.java.fm.ch8;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
            System.out.println(5);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메세지 출력 : " + ae.getMessage());
        }

        System.out.println(6);
        System.out.println(7);
    }
}
