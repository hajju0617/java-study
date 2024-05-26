package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력해주세요. :");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0 입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }

    }

}
