package com.java.fm.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();   // Tv 클래스 타입의 참조 변수 t선언 (메모리에 참조변수 공간 생성)
        Tv t2 = new Tv();   // 연산자 new 에 의해서 Tv 클래스의 인스턴스가 메모리 빈 공간에 생성
                            // 멤버변수는 각 자료형의 기본값으로 초기화 (=에 의해서 생성된 객체의 주소값이 참조변수 t에 저장.

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경했음.");
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}

//class Tv {
//    String color;
//    boolean power;
//    int channel;
//
//    void power() { power = !power; }
//    void channelUp() { ++channel; }
//    void channelDown() { --channel; }
//}
