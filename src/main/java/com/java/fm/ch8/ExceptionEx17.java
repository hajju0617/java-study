package com.java.fm.ch8;

public class ExceptionEx17 {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리 됨");
        }
    }


    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리 됨");
            throw e;
        }
    }
}
