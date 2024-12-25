package com.java.fm.ch8;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(0 / 0);
            System.out.println(3);
        } catch (ArithmeticException ae) {
            if (ae instanceof Exception) {
                System.out.println("ae instanceof Exception -> true!!");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(4);
    }
}
