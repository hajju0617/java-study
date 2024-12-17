package com.java.fm.ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D334 p3 = new Point3D334();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point334 {
    int x = 10, y = 20;
    Point334(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D334 extends Point334 {
    int z = 30;
    Point3D334() {
        this(100, 200, 300);
    }
    Point3D334(int x, int y, int z) {
        super(x, y);
        this.z =z;
    }
}