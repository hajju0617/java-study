package com.java.fm.ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent366 p = new Child366();
        Child366 c = new Child366();
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("===================");
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class Parent366 {
    int x = 100;
    void method() {
        System.out.println("Parent method()");
    }
}
class Child366 extends Parent366 {
    int x = 200;
    void method() {
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
        System.out.println("x = " + x);
    }
}
