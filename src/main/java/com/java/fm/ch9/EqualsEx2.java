package com.java.fm.ch9;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1 == p2) {
            System.out.println("p1과 p2는 같다");
        } else {
            System.out.println("p1과 p2는 다르다");
        }

        if(p1.equal(p2)) {
            System.out.println("p1과 p2는 같다");
        } else {
            System.out.println("p1과 p2는 다르다");
        }


    }
}


class Person {
    long id;

    public boolean equal(Object obj) {
        if(obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}