package com.java.fm.ch3;

public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32);       // 대소문자 간의 코드값 차이는 10진수로 32.
        System.out.println("upperCase = " + upperCase);
    }
}
