package com.java.fm.ch8;

public class ExceptionEx10 {
    public static void main(String[] args) {
        try {
            throw new Exception();      // 예외처리 해주면 빨간줄 사라짐(컴파일 에러)
        } catch (Exception e) {

        }
    }
}
