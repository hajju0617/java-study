package com.java.fm.ch6;

public class ProductTest {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public ProductTest() {

    }

    public static void main(String[] args) {
        System.out.println("count = " + count);
        ProductTest p1 = new ProductTest();
        System.out.println("count = " + count);
        ProductTest p2 = new ProductTest();
        System.out.println("count = " + count);
        ProductTest p3 = new ProductTest();
        System.out.println("count = " + count);
        System.out.println("p1의 제품 번호(serial No)는 " + p1.serialNo);
        System.out.println("count = " + count);
        System.out.println("p2의 제품 번호(serial No)는 " + p2.serialNo);
        System.out.println("count = " + count);
        System.out.println("p3의 제품 번호(serial No)는 " + p3.serialNo);
        System.out.println("count = " + count);
        System.out.println("생산된 제품의 수는 모두 " + ProductTest.count + "개.");
    }
}
