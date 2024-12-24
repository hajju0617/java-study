package com.java.fm.ch8;

public class ExceptionEx4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(100);
            }
        }
    }
}
