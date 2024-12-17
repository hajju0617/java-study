package com.java.fm.ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D332 p3 = new Point3D332(1,2,3);
    }
}

class Point332 {
    int x, y;

    Point332(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x = " + x + ", y = " + y;
    }
    Point332() {

    }
}

class Point3D332 extends Point332{
    int z;

    Point3D332(int x, int y, int z) {
        // super(); 를 컴파일러가 자동으로 넣어줌 -> 조상 클래스(Point332)의 기본 생성자가 없음 -> 에러.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }
}