package com.java.fm.ch7;

class AAA {
    int i = 100;
    BBB b = new BBB();
    class BBB {     // BBB 는 AAA 의 내부 클래스 (BBB 클래스는 AAA 클래스에만 사용)
        void method() {
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i);      // 위와 같이 객체 생성할 필요 없이 외부 클래스의 멤버에 바로 접근 가능.
        }


    }
}

class CCC {
//    BBB b = new BBB();
}
public class InnerTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
    }
}
