package com.java.fm.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                            { 100, 100, 100 }
                            ,{ 20, 20, 20 }
                            ,{ 30, 30, 30 }
                            ,{ 40, 40, 40 }
                        };
        int sum = 0;

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }
        // 향상된 for문
        for(int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }
        /*
        외부 루프에서의 배열([]) 선언: 외부 루프 for(int[] tmp : score)에서는 2차원 배열 score의 각 요소를 순회함
        여기서 각 요소는 1차원 배열입니다. 따라서 tmp 변수의 타입을 int[]로 선언해야 합니다
        이는 tmp가 1차원 배열을 가리키는 참조 변수임을 의미합니다
        score 배열의 각 요소는 정수형 배열이므로, tmp도 정수형 배열을 참조하는 변수로 선언해야 합니다

        (외부 루프: for(int[] tmp : score)는 score 배열의 각 요소(여기서는 1차원 배열)를 순회합니다
        score는 2차원 배열이므로, 이 루프는 score 배열의 각 '행'을 tmp 변수에 할당합니다
        즉, score 배열의 첫 번째 행부터 마지막 행까지 순차적으로 tmp에 할당되며, 각 할당된 tmp는 1차원 배열입니다.)

        내부 루프에서의 단일 변수 선언: 내부 루프 for (int i : tmp)에서는 tmp 배열(1차원 배열)의 각 요소를 순회합니다
        여기서 각 요소는 단일 정수 값입니다. 따라서 i 변수의 타입을 int로 선언해야 합니다
        i는 tmp 배열의 각 정수 값을 순차적으로 가리키는 변수로 사용됩니다.

        (내부 루프: for (int i : tmp)는 tmp 배열의 각 요소를 순회합니다
        tmp는 1차원 배열이며, 이 루프는 tmp 배열의 각 요소(정수 값)를 i 변수에 할당합니다
        즉, 현재 tmp 배열의 첫 번째 요소부터 마지막 요소까지 순차적으로 i에 할당되며, 각 할당된 i는 정수 값입니다.)

        요약하자면, 외부 루프에서는 2차원 배열의 각 요소(1차원 배열)를 순회하기 때문에 배열 타입 int[]를 사용하고
        내부 루프에서는 1차원 배열의 각 요소(단일 정수 값)를 순회하기 때문에 단일 정수 타입 int를 사용합니다
        이러한 방식으로 2차원 배열의 모든 요소를 효과적으로 순회할 수 있습니다.
         */
        System.out.println("sum = " + sum);
    }
}
