package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx27 {
    public static void main(String[] args) {
        int num, sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력. (종료하려면 0입력)");

        while (flag) {
            System.out.print(" : ");
            num = scanner.nextInt();
            scanner.nextLine();

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("sum = " + sum);
    }
}
