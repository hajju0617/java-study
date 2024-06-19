package com.java.fm.ch9;
import java.util.*;
public class CloneEx2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        /*
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = new int[arr.length];               // 배열 생성
        System.arraycopy(arr, 0, arrClone, 0, arr.length);  // 내용을 복사
         */

        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
