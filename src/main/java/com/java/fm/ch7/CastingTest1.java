package com.java.fm.ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car359 car = null;
        FireEngine359 fe1 = new FireEngine359();
        FireEngine359 fe2 = null;

        fe1.water();
        car = (Car359) fe1;         // 형변환 생략 가능. (자식 -> 부모)
//        car.water()               // 컴파일 에러. (Car타입의 참조변수로 water() 참조 불가.)
        fe2 = (FireEngine359) car;
        fe2.water();
    }
}

class Car359 {
    String color;
    int door;

    void drive() {
        System.out.println("drive, 드라이브");
    }

    void stop() {
        System.out.println("stop, 스탑");
    }
}

class FireEngine359 extends Car359{
    void water() {
        System.out.println("water, 워터");
    }
}


