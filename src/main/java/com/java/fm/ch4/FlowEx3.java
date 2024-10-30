package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력한 숫자는 0임.");
        } else {
            System.out.println("입력한 숫자는 0이 아님.");
        }
    }

}
