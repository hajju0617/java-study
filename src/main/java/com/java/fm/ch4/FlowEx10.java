package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        System.out.print("점수를 입력하세요. (1 ~ 100) : ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10) {
            case 10, 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다.");

        // Switch Expressions
        grade = switch(score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'F';
        };
        System.out.println("학점은 " + grade + "입니다.");
    }
}
