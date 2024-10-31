package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3, 4, 5 :
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6, 7, 8 :
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9, 10, 11 :
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
        }

        System.out.print("(Switch Expressions)현재 월을 입력하세요. : ");
        int month2 = scanner.nextInt();
        String season = (switch (month2) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "겨울";
        });
        System.out.println("현재의 계절은 " + season + "입니다.");
    }
}
