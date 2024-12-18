package com.java.fm.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time351 time = new Time351(11, 15, 23);
        System.out.println(time.toString());
//        time.hour = 10;     // private 이므로 접근 불가.
        time.setHour(time.getHour() + 1);       // setter로 접근해서 값을 변경. getter로 값을 뽑아냄.
        System.out.println(time.toString());

    }
}

class Time351 {
    private int hour, minute, second;

    Time351(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            return;
        }
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}