package com.java.fm.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("예외가 발생.");
            // 위 문장은 아래에 있는 두 코드를 축약한 것.
//            Exception e = new Exception("예외가 발생.");
//            throw e;
        } catch (Exception e) {
            System.out.println("예외 발생 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
