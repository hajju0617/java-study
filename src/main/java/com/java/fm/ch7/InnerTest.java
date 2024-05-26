package com.java.fm.ch7;

class AAA {
    int i = 100;
    BBB b = new BBB();
    class BBB {     // BBB 는 AAA 의 내부 클래스
        void method() {
            AAA a = new AAA();
            System.out.println(i);
        }


    }
}

class CCC {
//    BBB b = new BBB();
}
public class InnerTest {
    public static void main(String[] args) {
    }
}
