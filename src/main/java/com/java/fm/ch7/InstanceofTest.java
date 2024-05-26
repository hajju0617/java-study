package com.java.fm.ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("This is FireEngine instance");
        }
        if(fe instanceof Car) {
            System.out.println("This is Car instance");
        }
        if(fe instanceof Object) {
            System.out.println("This is Object instance");
        }
        System.out.println(fe.getClass().getName());
    }//main
}

class Car {}
class FireEngine extends Car {}
