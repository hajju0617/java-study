package com.java.fm.ch4;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random()) * 3 + 1;

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + com + "입니다.");

        switch (user - com) {
            case 2, -1 :
                System.out.println("user 패배, com 승.");
                break;
            case -2, 1 :
                System.out.println("user 승리, com 패배.");
                break;
            case 0 :
                System.out.println("user, com 비김.");
        }

        // Switch Expressions
        String result = switch (user - com) {
            case 2, -1 -> "패배";
            case -2, 1 -> "승리";
            case 0 -> "무승부";
            default -> "Error";
        };
        System.out.println("승부의 결과는 user 기준 " + result + "입니다.");
    }
}
