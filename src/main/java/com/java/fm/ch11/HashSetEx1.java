package com.java.fm.ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", Integer.valueOf(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
