package com.java.fm.ch5;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.printf("src.charAt(%d) = %c\n", i, ch);
        }
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}
