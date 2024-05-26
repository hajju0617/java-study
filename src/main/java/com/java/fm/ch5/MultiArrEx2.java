package com.java.fm.ch5;

import java.util.Scanner;
public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE]; // 5x5행렬 (0 ~ 4 x 0 ~ 4)
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        for(int i = 0; i < SIZE; i++) {
            for(int j =0; j < SIZE; j++) {
                x = (int)(Math.random() * SIZE); // 0 <= random < 1.0
                y = (int)(Math.random() * SIZE); // x,y의 값은 각각 0~4까지 정수 중에서 임의로 선택

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }   //
        }
        do {
            for(int i = 0; i < SIZE; i++) {
                for(int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);     // 빙고 5 x 5 생성
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1 ~ %d의 숫자를 입력하세요. (종료:0) : ", SIZE * SIZE);
            String tmp = scan.nextLine();
            num = Integer.parseInt(tmp);

            outer:
            for(int i = 0; i < SIZE; i++) {
                for(int j = 0; j < SIZE; j++) {
                    if(bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while(num!=0);
    }//main
}
