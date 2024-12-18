package com.java.fm.ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("오늘 날짜는 " + simpleDateFormat1.format(today));
        System.out.println("현재 시간은 " + simpleDateFormat2.format(today));

        // 상단 import문이 없다면 java.text.SimpleDateFormat 이렇게 적어야 됨.
    }
}
