package com.java.fm.ch5;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 버블정렬. 시간 복잡도 : O(n²)(비효율적이지만 간단)
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {       // 값 비교 횟수.
            boolean changed = false;    // 매 반복마다 초기화.

            for (int j = 0; j < numArr.length - 1 - i; j++) {   // 9-i -> i=0일때 j=0~8(9개), i=1일때 j=0~7(8개),,,i=8일때 j=0(1개)
                                                // 값 비교를 반복적으로 할 때마다 범위도 하나씩 줄어듦. (-i 한 이유)
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true;     // 자리 바꿈 발생!
                }
            }
            if (!changed) {
                break;
            }
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
