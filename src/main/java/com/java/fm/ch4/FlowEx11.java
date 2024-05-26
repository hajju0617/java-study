package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. (******-*******) :");
        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();
        char gender = regNo.charAt(7);
        String result,gender2;
        switch (gender) {
            case '1','3' -> {
                switch (gender) {
                    case '1' -> result = "남자이고 2000년 이전에";
                    default -> result = "남자이고 2000년 이후에";
                }
            }
            case '2','4' -> {
                switch (gender) {
                    case '2' -> result = "여자이고 2000년 이전에";
                    default -> result = "여자이고 2000년 이후에";
                }
            }
            default -> result = "알 수 없는 년도에";
        }
        System.out.printf("당신은 %s 출생한 사람입니다.", result);
    }
}
