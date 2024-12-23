package com.java.fm.ch7;

public class InnerEx1 {
    class InstanceInner405 {
        int iv = 100;
        final static int CONST = 1000;
    }

    static class StaticInner405 {
        int iv = 200;
        static int cv = 300;        // static 클래스만 static 멤버를 정의할 수 있음.
    }

    void myMethod() {
        class LocalInner405 {
            int iv = 400;
            final static int CONST = 500;

        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner405.CONST);
        System.out.println(StaticInner405.cv);
//        System.out.println(LocalInner405.CONST);     // 지역 내부 클래스는 메서드 내에서만 사용가능.
    }
}
