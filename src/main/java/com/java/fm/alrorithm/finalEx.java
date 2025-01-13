package com.java.fm.alrorithm;

public class finalEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.a);

    }
}


class Car {
    int a;
    final int b;

    Car() {
        this.b = 3;
    }
}