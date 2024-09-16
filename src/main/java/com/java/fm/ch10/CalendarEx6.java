package com.java.fm.ch10;

import java.util.*;

public class CalendarEx6 {
    public static void main(String[] args) {
        // 커맨드 라인에 년, 월 입력 (Ex. 2020 9)
        // 방법 : Run -> Edit Configurations -> Program Arguments 에 입력
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx6 2020 9");
            return;
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args.length);
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();     // 시작일
        Calendar eDay = Calendar.getInstance();     // 끝일
//        System.out.println(sDay.get(Calendar.YEAR));

        // 월의 경우 0~11이므로 -1 해줘야 됨.
        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);
        System.out.println(eDay.get(Calendar.DATE));

        // 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 됨.
        eDay.add(Calendar.DATE, -1);

        // 첫번째 요일이 무슨 요일인지 알아냄.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        System.out.println("START_DAY_OF_WEEK = " + START_DAY_OF_WEEK);

        // eDay에 지정된 날짜를 얻어옴
        END_DAY = eDay.get(Calendar.DATE);
        System.out.println("END_DAY = " + END_DAY);

        System.out.println("    " + args[0] + "년 " + args[1] + "월 ");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력.
        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }
        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
                System.out.println();
            }
        }
    }
}
