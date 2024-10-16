package com.java.fm.ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        //char c2 =  c1+1;          // 컴파일 에러발생 (수식에 변수가 들어가 있는 경우 컴파일러가 미리 계산할 수 없음)
        char c2 = 'a' + 1;          // 컴파일 에러없음

        System.out.println("c2 = " + c2);
    }
}
