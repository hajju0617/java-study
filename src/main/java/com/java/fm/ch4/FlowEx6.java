package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. :");

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        String output;
        switch (month) {
            case 3,4,5 -> output = "봄";
            case 6,7,8 -> output = "여름";
            case 9,10,11 -> output = "가을";
            default -> output = "겨울";
        };
        System.out.printf("현재의 계절은 %s 입니다.", output);
    }




}
