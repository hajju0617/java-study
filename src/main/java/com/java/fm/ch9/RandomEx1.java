package com.java.fm.ch9;

import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);
        /*
            같은 종자값(seed)을 갖는 Random 인스턴스는 시스템이나 실행 시간 등에 관계 없이
            항상 같은 값을 같은 순서로 반환 할 것을 보장함.
         */

        System.out.println("= rand =");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":" + rand.nextInt());
        }
        System.out.println();
        System.out.println("= rand2 =");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":" + rand2.nextInt());
        }
    }
}
