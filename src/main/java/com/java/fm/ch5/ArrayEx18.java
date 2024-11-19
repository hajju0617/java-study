package com.java.fm.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {40, 40, 40}
                , {60, 60, 60}
                , {80, 80, 80}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
            }
            System.out.println("==============================");
        }
        for (int[] tmp : score) {   // score의 1차원 배열주소를 tmp에 저장. (score[0] ~ score[4])
            for (int i : tmp) {     // 주소값을 통해 i로 출력.
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
