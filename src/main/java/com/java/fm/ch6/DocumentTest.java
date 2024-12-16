package com.java.fm.ch6;

public class DocumentTest {
    static int count = 0;
    String name;
    DocumentTest() {
        this("제목없음" + count++);
    }

    DocumentTest(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었음.");
    }

    public static void main(String[] args) {
        System.out.println("count = " + count);
        DocumentTest d1 = new DocumentTest();
        System.out.println("count = " + count);
        DocumentTest d2 = new DocumentTest("자바.txt");
        System.out.println("count = " + count);
        DocumentTest d3 = new DocumentTest();
        System.out.println("count = " + count);
        DocumentTest d4 = new DocumentTest();
        System.out.println("count = " + count);
    }
}
