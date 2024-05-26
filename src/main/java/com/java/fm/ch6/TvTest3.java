package com.java.fm.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경했음");
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다");
        /*
        TvTest2랑 TvTest3랑 동일하게 출력되는 부분이 있습니다.
        그 이유는 두 코드 모두에서 Tv 객체를 생성하고, 그 객체들의 초기 channel 값을 출력하는 과정이 포함되어 있기 때문
        Tv 클래스의 channel 필드는 int 타입으로, 객체가 생성될 때 기본값인 0으로 초기화됩니다.

        1번 코드와 2번 코드의 공통 부분:
        Tv 객체 t1과 t2가 생성됩니다.
        각 객체의 channel 값이 기본값 0으로 초기화됩니다. (자바에서 정수형 변수의 기본값은 0입니다.)
        객체 t1과 t2의 channel 값이 출력되며, 이때 모두 0입니다.
         */

    } //main
}
