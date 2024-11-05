package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 집밥");
            System.out.println("2. 배달음식");
            System.out.println("3. 외식");
            System.out.print("원하는 것을 선택. (종료 : 0) : ");

            menu = scanner.nextInt();
            scanner.nextLine();     // nextInt에서 입력한 개행문자(%n or \n) 처리. (nextInt는 개행문자 처리 못함)

            if (menu == 0) {
                System.out.println("종료.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("번호를 잘못 선택했음.");
                continue;
            }
            System.out.println("선택한 번호는 " + menu + "임.");
        }

    }
}
