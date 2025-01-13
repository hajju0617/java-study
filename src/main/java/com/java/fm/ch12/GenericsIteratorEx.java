package com.java.fm.ch12;


import java.util.ArrayList;
import java.util.Iterator;

public class GenericsIteratorEx {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바", 1, 1));
        list.add(new Student("스프링", 1, 2));
        list.add(new Student("데이터베이스", 2, 1));
        System.out.println(list);
        System.out.println("-------------");

        Iterator<Student> it = list.iterator();
        Iterator it2 = list.iterator();                        // 제네릭을 사용하지 않으면
        while (it.hasNext()) {
            Student s2 = (Student) it2.next();                  // 형변환이 필요함. (it2.next() : Object 반환)
            Student s = it.next();
            System.out.println(s.name);
            System.out.println(s2);
        }
    }
}

class Student {
    String name;
    int ban;
    int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                '}';
    }
}