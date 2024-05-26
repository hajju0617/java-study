package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx28 {
    public static void main(String[] args) {
        int input =0,answer=0;

        answer = (int)((Math.random() * 100) + 1);
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("1~100 사이의 정수를 입력하세요 :");
            input = scan.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            }
        } while(input != answer);
        System.out.println("정답입니다.");
    }
}
