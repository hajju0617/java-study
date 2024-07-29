package com.java.fm.ch9;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hi");
        System.out.println(str);
        System.out.println(str.length());

        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.capacity());

        StringBuffer str3 = new StringBuffer("01");
        StringBuffer str3_2 = str3.append(23);
        System.out.println("capacity = " + str3_2.capacity());
        System.out.println("capacity = " + str3.capacity());
    }
}
