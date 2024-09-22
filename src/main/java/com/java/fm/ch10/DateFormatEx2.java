package com.java.fm.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toString());
        cal.set(2005, 9, 3);    // Month : 0 ~ 11범위

        Date day = cal.getTime();   // Calendar -> Date 로 변환

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");     // 24시간 표기
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");       // 12시간 표기 (오전, 오후)

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));

    }
}
