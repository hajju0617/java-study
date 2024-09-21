package com.java.fm.ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");   // 소수 세 번째 자리까지 표시 (반올림)
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");  // 1234567.89 (1.23456789 * 10^6)
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));
        } catch (Exception e) {

        }
    }
}
