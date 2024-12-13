package com.java.fm.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경.");

        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);
    }
}
