package com.java.fm.ch9;

import java.util.Objects;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        // 기본형을 참조형으로 형변환 (형변환 생략가능)
        Integer intG = (Integer) i;
        Object obj = (Object) i;

        Long lng = 100L;
        int i2 = intG + 10;
        long l = intG + lng;

        Integer intG2 = 20;
        int i3 = (int)intG2;

        Integer intG3 = intG2 + i3;

        System.out.println("i = " + i);
        System.out.println("intG = " + intG);
        System.out.println("obj = " + obj);
        System.out.println("lng = " + lng);
        System.out.println("intG + 10 = " + i2);
        System.out.println("intG + lng = " + l);
        System.out.println("intG2 = " + intG2);
        System.out.println("i3 = " + i3);
        System.out.println("intG2 + i3 = " + intG3);
    }
}
