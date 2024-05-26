package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. (******-*******) :");

        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();
        String result;

        char gender = regNo.charAt(7);
        switch (gender) {
            case '1','3' -> result = "남자";
            case '2','4' -> result = "여자";
            default -> result = result = "알 수 없는 사람";
        }
        System.out.printf("당신은 %s입니다", result);
    }
}
