package com.java.fm.ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine362 fe = new FireEngine362();
        if (fe instanceof FireEngine362) {
            System.out.println("FireEngine 인스턴스");
        }
        if (fe instanceof Car362) {
            System.out.println("Car 인스턴스");
        }
        if (fe instanceof Object) {
            System.out.println("Object 인스턴스");
        }
        System.out.println("fe.getClass.getName : " + fe.getClass().getName());
    }
}

class Car362 {

}
class FireEngine362 extends Car362 {

}
