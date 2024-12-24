package com.java.fm.ch7;

public class InnerEx5 {
    public static void main(String[] args) {
        Outer409 outer409 = new Outer409();
        Outer409.Inner409 inner = outer409.new Inner409();
        inner.method();
    }
}

class Outer409 {
    int value = 10;     // Outer409.this.value

    class Inner409 {
        int value = 20; // this.value

        void method() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer409.this.value);
        }
    }
}
