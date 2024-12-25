package com.java.fm.ch8;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(0 / 0);
            System.out.println(3);
        } catch (ArithmeticException ae) {
            System.out.print("ae.printStackTrace() : ");
            ae.printStackTrace();
            System.out.println();
            System.out.println("예외 메시지 : " + ae.getMessage());
        }
        System.out.println(4);
    }
}
