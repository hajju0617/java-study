package com.java.fm.ch6;

public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("c1의 color : " + c1.color + ", c1의 gearType : " + c1.gearType + ", c1의 door : " + c1.door);
        System.out.println("c2의 color : " + c2.color + ", c2의 gearType : " + c2.gearType + ", c2의 door : " + c2.door);
        System.out.println();

        c1.door = 100;
        System.out.println("c1.door=100 수행 이후");
        System.out.println("c1의 color : " + c1.color + ", c1의 gearType : " + c1.gearType + ", c1의 door : " + c1.door);
        System.out.println("c2의 color : " + c2.color + ", c2의 gearType : " + c2.gearType + ", c2의 door : " + c2.door);

    }
}


class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
        this(c.color, c.gearType, c.door);
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}