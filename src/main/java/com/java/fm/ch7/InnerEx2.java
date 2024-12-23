package com.java.fm.ch7;

public class InnerEx2 {
    class InstanceInner406 {

    }
    static class StaticInner406 {

    }
    InstanceInner406 i = new InstanceInner406();                // 인스턴스 멤버간에는 서로 직접 접근이 가능.
    static StaticInner406 cv = new StaticInner406();            // static 멤버간에는 서로 직접 접근이 가능.

    static void staticMethod() {
//        InstanceInner406 obj1 = new InstanceInner406();       // static 멤버는 인스턴스 멤버에 직접 접근 불가.
        StaticInner406 obj2 = new StaticInner406();

        InnerEx2 outer = new InnerEx2();                        // 접근하려면 객체를 생성해야 접근 가능.
        InstanceInner406 obj1 = outer.new InstanceInner406();   // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성 가능.
    }

    void instanceMethod() {
        // 인스턴스 메서드에서는 인스턴스 멤버, static 멤버 모두 접근 가능.
        InstanceInner406 obj1 = new InstanceInner406();
        StaticInner406 obj2 = new StaticInner406();
//        LocalInner406 lv = new LocalInner406();               // 메서드 내에 선언된 지역 내부 클래스는 외부에서 접근 불가.
    }

    void myMethod() {
        class LocalInner406 {

        }
        LocalInner406 lv = new LocalInner406();
    }
}
