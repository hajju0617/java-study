package com.java.fm.ch4;
import java.util.*;
public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        num = scanner.nextInt();

        while (num != 0) {
            sum += num % 10;
            System.out.println("sum : " + sum + ", num : " + num);

            num /= 10;
        }
        System.out.println("각 자리 수의 합 : " + sum);
    }
}
