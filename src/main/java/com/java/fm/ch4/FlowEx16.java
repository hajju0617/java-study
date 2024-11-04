package com.java.fm.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        System.out.println("별 사각형 출력");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("별 계단 출력");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("별 계단 좌우반전");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("별 계단 뒤집기");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("별 계단 뒤집기 좌우반전");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("별 피라미드");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        System.out.println("별 피라미드 뒤집기");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 9 - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
