package com.java.fm.ch7;

public class YouStarcraft {
    public static void main(String[] args) {
////        Unit[] group = { new Marine(), new Tank(), new Dropship() }; // 이 코드를 풀어서 쓰면 아래처럼 쓸 수 있음
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new Marine();
//        group[2] = new Marine();
//
//        for(int i = 0; i < group.length; i++) {
//            group[i].move(100, 200);
//        }
////        group[0].move(100, 200);
////        group[1].move(100, 200);
////        group[2].move(100, 200);
////        위의 for문을 풀어서 쓰면 이렇다
    }
}

//abstract class Unit {
//    int x, y;
//    abstract void move(int x, int y);
//    void stop() { /* 현재 위치에 정지 */ }
//}
//class Marine extends Unit {
//    void move(int x, int y) {
//        System.out.println("Marine [x = " + x + ", y = " + y + "]");
//    }
//}
//class Tank extends Unit {
//    void move(int x, int y) {
//        System.out.println("Tank [x = " + x + ", y = " + y + "]");
//    }
//}
//class Dropship extends Unit {
//    void move(int x, int y) {
//        System.out.println("Dropship [x = " + x + ", y = " + y + "]");
//    }
//}