package com.java.fm.ch8;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었음.");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외가 처리되었음.");
            throw e;    // 다시 예외 발생시킴.
        }
    }
}
