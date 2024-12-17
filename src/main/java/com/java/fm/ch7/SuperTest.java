package com.java.fm.ch7;

public class SuperTest {
    public static void main(String[] args) {
        Child330 child330 = new Child330();
        child330.method();
    }
}

class Parent330 {
    int x = 10;
}

class Child330 extends Parent330 {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}