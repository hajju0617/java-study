package com.java.fm.ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car359 car1 = new Car359();
        Car359 car2 = null;
        FireEngine359 fe = null;
        car1.drive();
        fe = (FireEngine359) car1;      // 컴파일은 성공하지만, 실행 시 ClassCastException 발생.
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
