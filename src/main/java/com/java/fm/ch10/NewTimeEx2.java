package com.java.fm.ch10;

import java.time.*;
import java.time.temporal.TemporalAdjuster;

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 12, 31);
        LocalTime time = LocalTime.of(12, 34, 56);
        System.out.println("date = " + date);
        System.out.println("time = " + time);

        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        // ZonedDateTime -> OffsetDateTime
        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println("dt = " + dt);
        System.out.println("zid = " + zid);
        System.out.println("zdt = " + zdt);
        System.out.println("seoulTime = " + seoulTime);
        System.out.println("nyTime = " + nyTime);
        System.out.println("odt = " + odt);
    }
}
