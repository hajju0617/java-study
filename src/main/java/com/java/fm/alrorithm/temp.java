package com.java.fm.alrorithm;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class temp {
    public static void main(String[] args) {
        String strMethod = "";
        strMethod = str.tempPassword(10);
        System.out.println(strMethod);

    }
}

class str {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@^*?";

    private static final SecureRandom RANDOM = new SecureRandom();
    public static String tempPassword(int length) {
        StringBuilder password = new StringBuilder(length);
        password.append(UPPER.charAt(RANDOM.nextInt(UPPER.length())));
        password.append(LOWER.charAt(RANDOM.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(RANDOM.nextInt(SPECIAL.length())));
        String allChars = UPPER + LOWER + DIGITS;
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(RANDOM.nextInt(allChars.length())));
        }
        return password.toString();
    }
}
