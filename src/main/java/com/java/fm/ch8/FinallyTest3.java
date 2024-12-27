package com.java.fm.ch8;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1()의 실행을 마치고 main메서드로 돌아왔음.");
    }
    static void method1() {
        try {
            System.out.println("method1()이 호출되었음.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었음.");
        }
    }
}
