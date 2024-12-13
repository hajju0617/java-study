package com.java.fm.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);

        t2 = t1;    // t1이 저장하고 있던 주소값을 t2에 저장.
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경");

        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);
    }
}
