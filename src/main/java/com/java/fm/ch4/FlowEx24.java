package com.java.fm.ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트 다운 시작.");
        while (i-- != 0) {
            System.out.println(i);

            for (int j = 0; j <= 2_000_000_000; j++) {  // 숫자인 경우 '_'를 사용해서 가독성 높혀줄 수 있음.

            }
        }
        System.out.println("끝");
    }
}
