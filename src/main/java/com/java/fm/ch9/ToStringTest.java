package com.java.fm.ch9;

public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());

        String s = "012345";
        String s2 = s.replace("", "X");
        System.out.println(s2);

        String s3 = s.replace("", "X");
        System.out.println(s3);
    }
}
