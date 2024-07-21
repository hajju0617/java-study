package com.java.fm.alrorithm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class temp2 {
    public static void main(String[] args) {

        String birthDateString = "2024-02-29"; // 예시 문자열
        if (isValidBirthDate(birthDateString)) {
            System.out.println("유효한 생년월일입니다.");
        } else {
            System.out.println("유효하지 않은 생년월일입니다.");
        }
    }

    private static final String BIRTHDATE_REGEX = "^(19|20)\\d{2}-(0[13578]|1[02])-31$|^(19|20)\\d{2}-(0[1,3-9]|1[0-2])-30$|^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8])$";

    public static boolean isValidBirthDate(String birth) {
        return birth.matches(BIRTHDATE_REGEX);
    }
}
