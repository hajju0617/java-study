package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. :");

        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int com = (int)((Math.random() *3) + 1.0);

        System.out.printf("당신은 %d 입니다.", user);
        System.out.printf("컴퓨터는 %d 입니다.", com);
        String result;
        switch (user - com) {
            case 2,-1 -> result = "졌습니다";
            case 1,-2 -> result = "이겼습니다";
            default -> result = "비겼습니다";
        };
        System.out.printf("\n당신이 %s\n", result);
    }
}
