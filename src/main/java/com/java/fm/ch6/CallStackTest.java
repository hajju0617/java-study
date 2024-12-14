package com.java.fm.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {     // static 이므로 객체 생성 없이 호출 가능.
        secondMethod();
    }
    static void secondMethod() {
        System.out.println("secondMethod() 호출 되었음.");
    }
}
