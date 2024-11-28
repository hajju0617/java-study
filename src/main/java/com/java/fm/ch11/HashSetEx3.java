package com.java.fm.ch11;

import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        System.out.println(set);
        /*
        name, age가 같으면 같은 사람으로 인식하도록 코드를 작성하였지만
        서로 다른 것으로 인식하여 David가 2번 출력되었음.
         */
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + ":" + age;
    }
}
