package com.java.fm.ch7;

public class YouPlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();    // 추상 클래스의 객체를 생성 (불가)
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
        System.out.println();
        Player p = new AudioPlayer();   // 다형성
        p.play(50);
        p.stop();
    }
}

abstract class Player { // 추상클래스 (미완성 클래스, 미완성 설계도)
    abstract void play(int pos);   // 추상 메서드 (미완성 메서드)
    abstract void stop();   // 추상 메서드 (선언부만 있고 구현부{}없는 메서드)
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다." );
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}