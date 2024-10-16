package com.java.fm.ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10, b = 20;
        // byte c = a + b;     // 명시적 형변환 필요 (컴파일 에러 발생)
        byte c = (byte) (a + b);

        System.out.println("c = " + c);
    }
}
