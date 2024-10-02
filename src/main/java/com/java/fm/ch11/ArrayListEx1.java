package com.java.fm.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));   // 시작 인덱스는 포함, 끝 인덱스는 포함X
        System.out.println("결과값");
        print(list1, list2);

        Collections.sort(list1);    // 오름차순 정리
        Collections.sort(list2);
        System.out.println("Collections.sort 결과값");
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));   // 지정된 객체가 list1에 모두 포함되어 있는 지

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");      // 인덱스 3번에 A를 넣고, 기존 3번에 있던 B는 한칸 뒤로 밀려남.
        System.out.println("list2.add 결과값");
        print(list1, list2);

        list2.set(3, "AA");
        System.out.println("list2.set 결과값");
        print(list1, list2);

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));   // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제.
        System.out.println("list1.retainAll 결과값");
        print(list1, list2);


        System.out.println("list2.size = " + list2.size());
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {     // list2.get(i)가 list1에 포함되어 있는 지
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
