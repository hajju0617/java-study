package com.java.fm.ch7;

public class SuperTest2 {
    public static void main(String[] args) {
        Child331 child331 = new Child331();
        child331.method();
    }
}

class Parent331 {
    int x = 10;
}

class Child331 extends Parent330 {
    int x = 20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

