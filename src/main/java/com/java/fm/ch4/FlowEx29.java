package com.java.fm.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print("i = " + i);

            int tmp = i;    // i는 for문에 사용되는 변수이므로 tmp변수에 저장해서 사용.
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {   // 0 제외
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}
