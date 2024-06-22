package com.java.fm.ch6;

public class TvTest4 {
    /*
    자바에서 점(.)을 사용하는 것을 일반적으로 "도트 연산자"라고 부르지만,
    정확한 용어로는 "멤버 접근(참조) 연산자"라고 합니다.
    이 연산자는 객체의 속성이나 메소드에 접근할 때 사용됩니다.

    멤버 접근(참조) 연산자 (.)
    멤버 접근(참조) 연산자는 객체의 멤버(필드, 메소드, 내부 클래스 등)에 접근할 때 사용되는 연산자
    객체 지향 프로그래밍에서 객체의 상태는 필드(또는 속성)에 의해, 행동은 메소드에 의해 정의됩니다.
    따라서, 객체의 특정 필드 값을 읽거나 수정하거나, 객체가 가진 메소드를 호출할 때 멤버 접근(참조) 연산자를 사용합니다.
    객체의 멤버에 접근하려면 객체 이름 뒤에 점(.)을 붙이고 그 뒤에 멤버의 이름을 작성합니다.

    정리
    멤버 접근(참조) 연산자는 객체의 멤버(필드, 메소드 등)에 접근하기 위해 사용되는 연산자입니다.
    이 연산자는 객체의 상태를 나타내는 필드에 접근하거나, 객체의 행동을 정의하는 메소드를 호출할 때 사용됩니다.
     */
    public static void main(String[] args) {
        Tv242[] tvArr = new Tv242[3];

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv242();
            tvArr[i].channel = i + 10;
            System.out.printf("tvArr[%d] = %d\n", i, tvArr[i].channel);
        }

        System.out.println("channelUp");

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d] = %d\n", i, tvArr[i].channel);
        }
    }
}

class Tv242 {
    String color;
    int channel;
    boolean power;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
