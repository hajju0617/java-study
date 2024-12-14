package com.java.fm.ch6;


public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data data) {
        Data tmp = new Data();
        tmp.x = data.x;
        return tmp;
    }
}
