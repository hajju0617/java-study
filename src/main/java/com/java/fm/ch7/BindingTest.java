package com.java.fm.ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent364 p = new Child364();
        Child364 c = new Child364();
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class Parent364 {
    int x = 100;
    void method() {
        System.out.println("Parent364 method()");
    }
}
class Child364 extends Parent364 {
    int x = 200;
    void method() {
        System.out.println("Child364 method()");
    }
}