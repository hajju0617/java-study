package com.java.fm.ch7;

public class SuperTest2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        System.out.println(c.method2());
    }
}
class Parent {
    int x = 10;
    void method() {
        System.out.printf("x = %d, this.x = %d\n", x, this.x);
    }
    String method2() {
        return "x는 " + x + "이고, this.x는 " + this.x + "이다";
    }
}
class Child extends Parent {
    int x = 20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
    String method2() {
        return super.method2();
    }
}

