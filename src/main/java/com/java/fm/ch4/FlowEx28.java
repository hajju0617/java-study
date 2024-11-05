package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1 ~ 100 사이의 자연수 입력 : ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수를 입력.");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력.");
            }
        } while (answer != input);
        System.out.println("일치");
    }
}
