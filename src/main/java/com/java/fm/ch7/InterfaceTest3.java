package com.java.fm.ch7;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A399 a = new A399();
        a.methodA();
    }
}

interface I399 {
    public abstract void methodB();
}
class A399 {
    void methodA() {
        I399 i = InstanceManager399.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
class B399 implements I399{
    public void methodB() {
        System.out.println("B 클래스 안에 있는 methodB()");
    }
    public String toString() {
        return "class B399";
    }
}
class InstanceManager399 {
    public static I399 getInstance() {
        return new B399();
    }
}