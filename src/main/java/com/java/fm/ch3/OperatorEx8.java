package com.java.fm.ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;
        System.out.println("c = " + c);     // int * int = int 라서 c의 값이 이상하게 출력 됨.
                                            // 연산할 때 형변환을 해줘야함.

        long d = (long) a * b;
        System.out.println("d = " + d);
    }
}
