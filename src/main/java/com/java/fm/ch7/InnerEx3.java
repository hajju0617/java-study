package com.java.fm.ch7;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner407 {
        int iiv = outerIv;          // 외부 클래스의 private 멤버도 접근 가능.
        int iiv2 = outerCv;
    }

    static class StaticInner407 {
//        int siv = outerIv;        // static 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가.
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;
        class LocalInner407 {
            int liv = outerIv;
            int liv2 = outerCv;
//            int liv3 = lv;        // 원래는 에러. (JDK 1.8부터는 에러가 아님.)
            int liv4 = LV;
        }
    }
}
