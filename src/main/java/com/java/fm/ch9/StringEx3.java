package com.java.fm.ch9;

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];      // = char[] cArr = {};
        String s = new String(cArr);    // = String s = new String("");


        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");

        char[] Arr = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(Arr);
        System.out.println(Arr);
    }
}
