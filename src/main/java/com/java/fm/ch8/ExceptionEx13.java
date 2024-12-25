package com.java.fm.ch8;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외가 try-catch에 의해 처리되었음.");
            e.printStackTrace();
            System.out.println("메시지 : " + e.getMessage());
        }
    }
}
