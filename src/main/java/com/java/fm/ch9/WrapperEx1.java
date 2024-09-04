package com.java.fm.ch9;

public class WrapperEx1 {
    public static void main(String[] args) {
//        Integer i = new Integer(100);   // Integer(int) 생성자는 Java 9부터 사용이 권장되지 않으며 향후 제거될 예정

        /*
        Integer i = 100;    // 자동 박싱(Auto Boxing) -> Int와 같은 기본형 데이터를 자동으로 Integer 객체로 변환
        Integer i = Integer.valueOf(100);   // 명시적으로 Integer 객체 생성 -> Integer.valueOf 메서드 : 주어진 int 값을 가지는 Integer 객체를 반환
         */
        Integer i = 128;
        Integer i2 = 128;

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("-------------------------------------");

        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        System.out.println("BYTES = " + Integer.BYTES + " bytes");
        System.out.println("TYPE = " + Integer.TYPE);

    }
}
