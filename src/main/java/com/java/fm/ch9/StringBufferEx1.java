package com.java.fm.ch9;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hi");
        System.out.println(str);
        System.out.println(str.length());

        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.capacity());
    }
}
