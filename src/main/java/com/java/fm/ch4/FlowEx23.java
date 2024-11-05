package com.java.fm.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
        while (i-- != 0) {
            System.out.println(i + "- 가나다");
        }


        i = 5;
        System.out.println("--i");
        while (--i != 0) {
            System.out.println(i + "- 가나다");
        }
    }
}
