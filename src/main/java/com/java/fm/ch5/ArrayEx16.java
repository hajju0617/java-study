package com.java.fm.ch5;

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}

// Run -> Edit Configurations -> 내가 적용할 자바 파일을 선택하고 Program arguments에 매개변수를 입력한다.
