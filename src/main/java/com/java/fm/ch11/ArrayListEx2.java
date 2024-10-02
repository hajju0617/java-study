package com.java.fm.ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        int length = source.length();
        System.out.println("length = " + length);

        List list = new ArrayList(length / LIMIT + 10);     // 초기 용량 14
        /*
        용량 (capacity): ArrayList가 내부적으로 확보한 메모리 공간의 크기.
                        이 공간은 리스트가 실제로 채워지기 전에 미리 확보됨.
                        즉, 초기 용량을 설정하면, 요소를 추가할 때 자동으로 용량을 늘리는 작업을 줄여
                        성능을 개선할 수 있음.
                        리스트에 요소가 추가되기 전까지 크기(size)는 0

        크기 (size): ArrayList에 실제로 들어간 요소의 개수.
                    리스트에 요소가 추가되지 않으면 크기는 0, 요소를 추가해야만 size가 증가.
         */



        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));   // substring : beginIndex 포함, endIndex 포함X
            } else {
                list.add(source.substring(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
