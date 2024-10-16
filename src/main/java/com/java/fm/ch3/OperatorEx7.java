package com.java.fm.ch3;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10, b = 30;
        byte c = (byte) (a * b);
        System.out.println("c = " + c);     // 300이 아니라 44가 출력됨.
                                            // int -> byte 형변환이라 '값 손실'이 발생
    }
}
