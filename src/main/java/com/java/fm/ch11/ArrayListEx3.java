package com.java.fm.ch11;

import java.util.Vector;

public class ArrayListEx3 {
    public static void main(String[] args) {
        Vector v = new Vector(5);   // 용량(capacity)이 5.
        v.add("1");
        v.add("2");
        v.add("3");
        System.out.println("----- v.add 결과값 -----");
        print(v);
        System.out.println();

        v.trimToSize();     // 빈 공간을 없앰 -> 용량과 크기가 같아짐.
        System.out.println("===== After trimToSize() =====");
        print(v);

        v.ensureCapacity(6);    // 용량(capacity)을 최소한 (숫자)만큼 보장.
        System.out.println("===== After ensureCapacity(6) =====");
        print(v);

        v.setSize(7);       // 크기(size)를 7로 설정. Vector의 크기가 현재보다 작으면 새로운 요소가 null로 채워짐.
        System.out.println("===== After setSize(7) =====");
        print(v);

        v.clear();
        System.out.println("===== After clear() =====");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
