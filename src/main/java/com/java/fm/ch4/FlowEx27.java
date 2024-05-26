package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx27 {
    public static void main(String[] args) {
        int num, sum =0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);


        while(flag) {
            System.out.print("합계를 구할 숫자를 입력하세요 :");
            String tmp = scan.nextLine();
            num = Integer.parseInt(tmp);

            if(num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 = " + sum);
    }
}
