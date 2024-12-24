package com.java.fm.ch7;

public class InnerEx4 {
    public static void main(String[] args) {
        // 인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야함.
        Outer408 oc = new Outer408();
        Outer408.InstanceInner408 ii = oc.new InstanceInner408();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer.StaticInner408.cv : " + Outer408.StaticInner408.cv);

        // static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도됨.
        Outer408.StaticInner408 si = new Outer408.StaticInner408();
        System.out.println("si.iv : " + si.iv);
    }

}

class Outer408 {
    class InstanceInner408 {
        int iv = 100;
    }
    static class StaticInner408 {
        int iv = 200;
        static int cv = 300;
    }
    void myMethod() {
        class LocalInner408 {
            int iv = 400;
        }
    }
}