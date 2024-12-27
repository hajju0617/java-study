package com.java.fm.ch8;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException446 e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException446 {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException446 se) {
            InstallException446 ie = new InstallException446("설치 중 예외가 발생함. (SpaceException)");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException446 me) {
            InstallException446 ie = new InstallException446("설치 중 예외가 발생함. (MemoryException)");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException446, MemoryException446 {
        if (!enoughSpace()) {
            throw new SpaceException446("설치할 공간이 없음.");
        }
        if (!enoughMemory()) {
            throw new MemoryException446("메모리가 부족함.");
//            throw new RuntimeException(new MemoryException2("메모리가 부족함."));
        }
    }

    static void copyFiles() {       }
    static void deleteTempFiles() {       }
    static  boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}
class InstallException446 extends Exception {
    InstallException446(String msg) {
        super(msg);
    }
}
class SpaceException446 extends Exception {
    SpaceException446(String msg) {
        super(msg);
    }
}
class MemoryException446 extends Exception {
    MemoryException446(String msg) {
        super(msg);
    }
}
