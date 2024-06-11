package com.java.fm.ch8;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
            System.out.println(5);
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) {
                System.out.println("ArithmeticException 발생");
                System.out.println(6);
            }

        } catch (Exception e) {
            System.out.println("Exception 으로 처리");
        }


        System.out.println(7);
    }
}
