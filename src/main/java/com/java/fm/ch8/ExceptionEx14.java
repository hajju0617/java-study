package com.java.fm.ch8;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("method1의 예외가 main메서드에서 처리 되었음.");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception {
        throw new Exception();
    }
}
