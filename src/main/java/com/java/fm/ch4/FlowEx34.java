package com.java.fm.ch4;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        outer : while (flag) {
            System.out.println("1. square");
            System.out.println("2. square root");
            System.out.println("3. log");
            System.out.print("원하는 것을 선택. (종료 : 0) : ");

            menu = scanner.nextInt();
            scanner.nextLine();     // nextInt에서 입력한 개행문자(%n or \n) 처리. (nextInt는 개행문자 처리 못함)

            if (menu == 0) {
                System.out.println("종료.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("번호를 잘못 선택했음. (종료 : 0)");
                continue;
            }

            for ( ; ; ) {
                System.out.print("계산할 값을 입력. (계산 종료 : 0, 전체 종료 : 99) : ");
                num = scanner.nextInt();
                scanner.nextLine();     // nextInt에서 입력한 개행문자(%n or \n) 처리. (nextInt는 개행문자 처리 못함)

                if (num == 0) {
                    break;
                }
                if (num == 99) {
                    break outer;
                }
                switch (menu) {
                    case 1 -> System.out.println("result : " + num * num);
                    case 2 -> System.out.println("result : " + Math.sqrt(num));
                    case 3 -> System.out.println("result : " + Math.log(num));
                }
            }

        }
        System.out.println("종료.");
    }
}
