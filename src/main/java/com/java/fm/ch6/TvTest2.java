package com.java.fm.ch6;

public class TvTest2 {

    public static void main(String[] args) {

        Tv237 tv237 = new Tv237();
        Tv237 tv237a = new Tv237();

        System.out.println("tv237의 channel 값은 " + tv237.channel + "입니다.");
        System.out.println("tv237a의 channel 값은 " + tv237a.channel + "입니다.");

        tv237.channel = 8;
        System.out.println("tv237의 channel 값을 8로 변경");

        System.out.println("tv237의 channel 값은 " + tv237.channel + "입니다.");
        System.out.println("tv237a의 channel 값은 " + tv237a.channel + "입니다.");
    }

}


class Tv237 {
    String color;
    int channel;
    boolean power;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
