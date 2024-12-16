package com.java.fm.ch6;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();         // 기본 생성자 -> 인스턴스 변수들 각각 개별로 초기화.
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);   // 매개변수 있는 생성자 -> 생성과 동시에 값 초기화.
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
}
