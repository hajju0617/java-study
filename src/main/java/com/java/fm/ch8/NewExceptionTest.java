package com.java.fm.ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println("에러 메시지 : " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간 확보 후 다시 설치.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();        // 가비지 컬렉션을 사용해서 메모리 늘려줌.
            System.out.println("다시 시도.");
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족함.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족함");
        }
    }
    static void copyFiles() {        }
    static void deleteTempFiles() {        }
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}
class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}
class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}