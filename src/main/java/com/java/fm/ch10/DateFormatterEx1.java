package com.java.fm.ch10;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        String[] patternArr = {
                "yyyy-MM-dd HH:mm:ss"
                , "''yy년 MMM dd일 E요일"
                , "yyyy-MM-dd HH:mm:ss.SSS z VV"
                , "yyyy-MM-dd hh:mm:ss a"
                , "오늘은 올 해의 D번째 날 입니다."
                , "오늘은 이 달의 d번째 날 입니다."
                , "오늘은 올 해의 w번째 주 입니다."
                , "오늘은 이 달의 W번째 주 입니다."
                , "오늘은 이 달의 W번째 E요일입니다."
        };

        for (String p : patternArr) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zonedDateTime.format(formatter));
        }
    }
}
