package com.java.fm.ch12;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsHashMapEx {
    public static void main(String[] args) {
        HashMap<String, Student2> map = new HashMap<>();            // String = 'key', Student2 = 'value'
        map.put("자바", new Student2("자바", 1, 1, 100, 100, 100));
        System.out.println("map = " + map);

        Student2 s = map.get("자바");             //  public V get(Object key)
        System.out.println(s.name);
        System.out.println(map.get("자바"));
        System.out.println(map.get("자바").name);
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int  kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}