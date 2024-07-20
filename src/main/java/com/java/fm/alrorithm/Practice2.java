package com.java.fm.alrorithm;

import java.util.Date;

public class Practice2 {
    public static void main(String[] args) {
        String str = "rks123@naver.com";
        String str2 = "rkskek123@naver.com";
        String str3 = "rkskekfkak123@naver.com";

        String id = extractIdFromEmail(str);
        System.out.println(id);
        System.out.println(maskId(id));
        String userEmail = maskEmail(str);
        System.out.println(userEmail);
        System.out.println(maskEmail(str2));
        System.out.println(maskEmail(str3));
    }
    public static String maskEmail(String email) {
        String id = extractIdFromEmail(email);
        String maskedId = maskId(id);
        String domain = email.split("@")[1];
        System.out.println(domain);
        return maskedId + "@" + domain;
    }

    public static String extractIdFromEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("유효한 이메일 주소를 입력하세요.");
        }

        // 이메일에서 @ 앞 부분(ID 부분)만 떼어내기
        return email.split("@")[0];
    }
    public static String maskId(String id) {
        int length = id.length();
        StringBuilder maskedId = new StringBuilder(id);

        if (length == 6) {
            // 뒤에서 두 번째 문자까지 *로 처리
            for (int i = length - 2; i < length; i++) {
                maskedId.setCharAt(i, '*');
            }
        } else if (length > 6 && length <= 9) {
            // 뒤에서 세 번째 문자까지 *로 처리
            for (int i = length - 3; i < length; i++) {
                maskedId.setCharAt(i, '*');
            }
        } else if (length > 9) {
            // 뒤에서 다섯 번째 문자까지 *로 처리
            for (int i = length - 5; i < length; i++) {
                maskedId.setCharAt(i, '*');
            }
        }
        return maskedId.toString();
    }

}

