package com.java.fm.ch7;

import com.java.fm.ch6.Tv;

public class CaptionTvTest1 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();    // 자손 클래스 인스턴스를 생성 -> 조상 클래스의 멤버도 함께 생성.
                                            // 즉, 조상 클래스 멤버, 자손 클래스 멤버가 합쳐진 하나의 인스턴스가 생성.
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println("ctv.channel = " + ctv.channel);
        ctv.displayCaption("캡션티비");
        ctv.caption = true;
        ctv.displayCaption("캡션티비");
    }
}

class Tv315 {
    boolean power;
    int channel;
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class CaptionTv extends Tv315 {     // Tv315 : (조상, 부모, 상위)클래스
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println("text = " + text);
        }
    }
}