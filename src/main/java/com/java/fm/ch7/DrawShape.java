package com.java.fm.ch7;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {
                          new Point(100, 100)
                        , new Point(200, 200)
                        , new Point(300, 300)
                        , new Point()
                    };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);
        Circle c2 = new Circle();
        t.draw();
        c.draw();
        c2.draw();
    }
}

class Shape {           // 도형.
    String color = "black";
    void draw() {
        System.out.printf("[color = %s]%n", color);
    }
}

class Point {           // 점
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle extends Shape {            // Shape : 상속 관계
    Point center;       // 원점 좌표.        Point : 포함 관계
    int r;          // 반지름.

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }
    Circle() {
        this(new Point(0, 0), 100);     // Circle(Point center, int r) 호출.
    }

    void draw() {       // 오버라이딩.
        System.out.printf("[center = (%d, %d), r = %d, color = %s]%n"
                                    , center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[4];

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, p4 = %s, color = %s]%n"
                            , p[0].getXY(), p[1].getXY(), p[2].getXY(), p[3].getXY(), color);
    }
}