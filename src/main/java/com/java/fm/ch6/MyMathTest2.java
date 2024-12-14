package com.java.fm.ch6;
public class MyMathTest2 {
    public static void main(String[] args) {
        // 클래스 메서드 (static 메서드)
        System.out.println("MyMath2.add(200L, 100L) = " + MyMath2.add(200L, 100L));
        System.out.println("MyMath2.subtract(200L, 100L) = " + MyMath2.subtract(200L, 100L));
        System.out.println("MyMath2.multiply(200L, 100L) = " + MyMath2.multiply(200L, 100L));
        System.out.println("MyMath2.divide(200.0, 100.0) = " + MyMath2.divide(200.0, 100.0));
        System.out.println();

        // 인스턴스 메서드
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println("mm.add() = " + mm.add());
        System.out.println("mm.subtract() = " + mm.subtract());
        System.out.println("mm.multiply() = " + mm.multiply());
        System.out.println("mm.divide() = " + mm.divide());
    }
}

class MyMath2 {
    long a, b;

    // 인스턴스 메서드 : (인스턴스 변수 a, b만을 이용 -> 매개변수 필요x)
    long add() {
        return a + b;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return (double) a / b;
    }

    // 클래스 메서드 (static 메서드) : (인스턴스 변수와 관계없이 매개변수만으로 가능.)
    static long add(long a, long b) {
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }
}
