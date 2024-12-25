package com.java.fm.ch8;


public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();
        // Exception in thread "main" java.lang.RuntimeException at com.java.fm.ch8.ExceptionEx11.main(ExceptionEx11.java:5)
        // 컴파일이 됨. RuntimeException은 프로그래머 실우로 발생하는 것이라 예외처리가 강제하지 않음.
    }
}
