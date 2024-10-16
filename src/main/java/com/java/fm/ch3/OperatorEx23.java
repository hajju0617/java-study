package com.java.fm.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b\n", "abc" == "abc");
        System.out.printf(" str1 == \"abc\" ? %b\n", str1 == "abc");
        System.out.println();
        System.out.printf(" str2 == \"abc\" ? %b\n", str2 == "abc");
        System.out.printf("str1.equals(\"abc\") ? %b\n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b\n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b\n", str2.equals("ABC"));
        System.out.printf("str2.equalIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));


        /*
        == 연산자는 두 객체의 참조값(메모리 주소)을 비교함.
        즉, 두 객체가 동일한 메모리 주소를 가리키고 있는지를 확인.
        equals() 메소드는 두 객체의 내용 자체를 비교함.
        이 메소드는 객체가 가지고 있는 실제 데이터의 동등성을 검사.

        new 를 사용하여 생성된 객체는 항상 새로운 메모리 주소에 할당됨.
        */
    }
}
