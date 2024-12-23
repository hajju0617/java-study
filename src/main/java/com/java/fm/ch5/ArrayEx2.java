package com.java.fm.ch5;

import java.util.Arrays;
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 90, 80, 70, 60};
        int[] iArr3 = {100, 90, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);  // 참조 변수 출력
        System.out.println(chArr);  // char[]의 경우 println으로 출력해도 각 요소들이 그대로 출력됨.
    }
}
