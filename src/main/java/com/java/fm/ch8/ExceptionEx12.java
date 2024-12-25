package com.java.fm.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
    /*
            Exception in thread "main" java.lang.Exception
	        ExceptionEx12.method2(ExceptionEx12.java:11)
	        ExceptionEx12.method1(ExceptionEx12.java:8)
	        ExceptionEx12.main(ExceptionEx12.java:5)
    */
}
