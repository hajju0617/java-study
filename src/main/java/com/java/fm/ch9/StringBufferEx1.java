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

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        // StringBuffer 내용을 String 으로 변환
        String s = sb.toString();
        String s2 = sb2.toString();
        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
