package com.java.fm.ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "dise"};

        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어

        boolean bool = true;

        for (String datum : data) {
            Matcher m = p.matcher(datum);

            if (m.matches()) {
                if (!bool) {
                    System.out.print(", ");
                }
                System.out.print(datum);
                bool = false;
            }
        }
    }
}
