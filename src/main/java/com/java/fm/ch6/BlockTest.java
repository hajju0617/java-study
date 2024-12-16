package com.java.fm.ch6;

public class BlockTest {
    static {    // 클래스 초기화 블럭.
        System.out.println("static { }");
    }
    {           // 인스턴스 초기화 블럭.
        System.out.println("{ }");
    }
    public BlockTest() {
        System.out.println("생성자 호출!");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt1 = new BlockTest();");
        BlockTest bt1 = new BlockTest();
        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }
}

