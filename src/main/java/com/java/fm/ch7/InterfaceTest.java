package com.java.fm.ch7;

public class InterfaceTest {
    public static void main(String[] args) {
        A396 a = new A396();
        a.methodA(new B396());
    }
}

class A396 {
    public void methodA(B396 b) {
        b.methodB();
    }
}
class B396 {
    public void methodB() {
        System.out.println("methodB()");
    }
}
