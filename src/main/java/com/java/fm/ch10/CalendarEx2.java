package com.java.fm.ch10;

import java.util.*;

public class CalendarEx2 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에 DAY_OF_WEEK[0]은 비움
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month의 경우 0부터 시작하기 때문에 1월일 경우 0으로 지정.
        date1.set(2023, 0, 1);      // date1.set(2030, Calendar.JANUARY, 1); 이렇게도 가능
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
        System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일이다.");

        // 두 날짜간의 차이를 얻으려면 getTimeInMillis() 1/1000초 단위로 변환 해야 됨.
        long difference = ((date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000);
        System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났음.");
        System.out.println("일(day)로 계산하면 " + (difference / (24 * 60 * 60)) + "일이다.");
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 "
                + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일 ";
    }

}
