package com.java.fm.ch6;

public class MemberCall {
    int iv = 10;            // 인스턴스 변수
    static int cv = 20;     // 클래스 변수

    int iv2 = cv;
//    static int cv2 = iv;    // 클래스 변수는 인스턴스 변수 사용 못함.
    static int cv2 = new MemberCall().iv;   // 객체 생성하면 가능.

    static void staticMethod1() {
        System.out.println("cv = " + cv);
//        System.out.println("iv = " + iv); // 클래스 메서드에서 인스턴스 변수 사용 못함.
        MemberCall mc = new MemberCall();
        System.out.println(mc.iv);          // 객체 생성 후 인스턴스 변수 참조 가능.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);             // 인스턴스 메서드이므로 인스턴스 변수 바로 사용 가능.
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();                // 클래스 메서드에서 인스턴스 메서드 호출 불가.
        MemberCall mc = new MemberCall();
        mc.instanceMethod1();               // 인스턴스 생성 후 호출 가능.
    }

    void instanceMethod2() {                // 인스턴스 메서드이므로 인스턴스 메서드, 클래스 메서드
        staticMethod1();                    // 둘 다 인스턴스 생성 없이 호출 가능.
        instanceMethod1();
    }
}
