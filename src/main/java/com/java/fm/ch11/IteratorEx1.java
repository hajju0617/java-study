package com.java.fm.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator it = list.iterator();

        while (it.hasNext()) {          // 읽어올 요소가 있는 지 확인.
            Object obj = it.next();     // 다음 요소를 읽어옴.
            System.out.println(obj);
        }
    }
}
