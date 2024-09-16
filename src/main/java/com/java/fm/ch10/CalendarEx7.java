package com.java.fm.ch10;

import java.util.Calendar;

public class CalendarEx7 {
    public static void main(String[] args) {
        // 커맨드 라인에 년, 월 입력 (Ex. 2024 9)
        // 방법 : Run -> Edit Configurations -> Program Arguments 에 입력
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx7 2024 9");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1);
        // 월의 경우 0 ~ 11이므로 1을 빼줘야 함.

        eDay.set(year, month - 1, sDay.getActualMaximum(Calendar.DATE) + 1);
        // 입력월의 말일로 설정.

        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
        // 1일이 속한 주의 일요일로 날짜 설정.

        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
        // 말일이 속한 주의 토요일로 날짜 설정.

        System.out.println("        " + year + "년 " + month + "월 ");
        System.out.println(" SU MO TU WE TH FR SA");

        // 시작일부터 마지막 일까지 (sDay <= eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
        for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);
            if (n++ % 7 == 0) {
                System.out.println();
            }
        }
    }
}
