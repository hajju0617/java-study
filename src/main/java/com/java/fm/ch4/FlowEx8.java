package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("주민등록번호를 입력하세요. (ex.123456-1234567) : ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);      // 입력한 문자에서 8번째 문자를 추출. ( charAt(index)에서 index는 0부터 시작 )
        System.out.println(gender);

        switch (gender) {
            case '1', '3' :
                System.out.println("당신은 남자입니다.");
                break;
            case '2', '4' :
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호임.");
        }

        // Switch Expressions
        String strGender = switch (gender) {
            case '1', '3' -> "남자";
            case '2', '4' -> "여자";
            default -> "유효하지 않은 주민등록번호";
        };
        System.out.println(strGender);
    }
}
