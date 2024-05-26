package com.java.fm.ch6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;      // 클래스 변수는 인스턴스 변수를 사용할 수 X
    static int cv2 = new MemberCall().iv;


    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }
    static void staticMethod() {
        staticMethod1();
//        instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }
    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();

    }
}
