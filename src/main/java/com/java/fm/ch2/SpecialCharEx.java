package com.java.fm.ch2;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');		        //  '''처럼 할 수 없다.  ( ' 하나만 출력)
        System.out.println("abc\t123\b456");    // \b에 의해 3이 지워짐.
        System.out.println('\n');		        //  개행(new line)문자 출력하고 개행(println이라서)
        System.out.println("\"Hello\"");	    //  큰따옴표를 출력하려면 이렇게 함.
        System.out.println("c:\\");
    }
}
