package com.java.fm.ch7;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A398 a = new A398();
        a.autoPlay(new B398());
        a.autoPlay(new C398());
    }
}

interface I398 {
    public abstract void play();
}
class A398 {
    void autoPlay(I398 i) {
        i.play();
    }
}
class B398 implements I398 {
    public void play() {
        System.out.println("B 클래스 play");
    }
}
class C398 implements I398 {
    public void play() {
        System.out.println("C 클래스 play");
    }
}

