package com.java.fm.ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();
        while (it.hasNext()) {          // 읽어올 다음 요소가 있는 지 체크.
            System.out.print(it.next());
        }
        System.out.println();
        while (it.hasPrevious()) {      // 읽어올 이전 요소가 있는 지 체크.
            System.out.print(it.previous());
        }

    }
}
