package com.java.fm.ch7;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent365 p = new Child365();
        Child365 c = new Child365();
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent365 {
    int x = 100;
    void method() {
        System.out.println("Parent method()");
    }
}
class Child365 extends Parent365 {

}