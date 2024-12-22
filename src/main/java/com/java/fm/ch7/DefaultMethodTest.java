package com.java.fm.ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child402 c = new Child402();
        c.method1();
        c.method2();
        MyInterface_402.staticMethod();
        MyInterface2_402.staticMethod();
    }
}

class Child402 extends Parent402 implements MyInterface_402, MyInterface2_402 {
    // method2()는 조상 클래스의 메서드가 상속됨, 디폴트 메서드는 무시.
    public void method1() {     // 여러 인터페이스의 디폴트 메서드간의 충돌 -> 디폴트 메서드 오버라이딩으로 해결.
        System.out.println("Child 클래스 안에 method1()");
    }
}
class Parent402 {
    public void method2() {
        System.out.println("Parent 클래스 안에 method2()");
    }
}
interface MyInterface_402 {
    default void method1() {
        System.out.println("MyInterface 인터페이스 안에 method1()");
    }
    default void method2() {
        System.out.println("MyInterface 인터페이스 안에 method2()");
    }
    static void staticMethod() {
        System.out.println("MyInterface 인터페이스 안에 staticMethod()");
    }
}
interface MyInterface2_402 {
    default void method1() {
        System.out.println("MyInterface2 인터페이스 안에 method1()");
    }
    static void staticMethod() {
        System.out.println("MyInterface2 인터페이스 안에 staticMethod()");
    }
}
