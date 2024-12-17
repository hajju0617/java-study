package com.java.fm.ch7;

public class TVCR extends Tv324 {
    VCR vcr = new VCR();    // VCR 클래스를 포함시킴.

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}

class Tv324 {
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

class VCR {
    boolean power;
    int counter;
    void power() {
        power = !power;
    }
    void play() {

    }
    void stop() {

    }
    void rew() {

    }
    void ff() {

    }
}

