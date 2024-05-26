package com.java.fm.ch6;
public class MyMathTest2 {
    public static void main(String[] args) {
        Mymath2 mm = new Mymath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
        System.out.println("----------------------");

        System.out.println(Mymath2.add(200,100));
        System.out.println(Mymath2.subtract(200, 100));
        System.out.println(Mymath2.multiply(200,100));
        System.out.println(Mymath2.divide(200.0, 100.0));

    }
}

class Mymath2 {
    long a, b;

    // 인스턴스 메서드
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    // 클래스 메서드
    static long add(long a, long b) { return a + b; }
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}
