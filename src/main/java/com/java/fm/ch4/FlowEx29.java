package com.java.fm.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++) {
            System.out.printf("i = %d ", i);

            int tmp = i;
            System.out.printf("tmp%%10%%3 = %d, tmp %% 10 = %d\n", tmp%10%3, tmp%10);
            do{
                if(tmp%10%3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);
            System.out.println();
        }

    }
}
