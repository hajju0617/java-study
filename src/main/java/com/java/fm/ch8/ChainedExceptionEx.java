package com.java.fm.ch8;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 se) {
            InstallException ie = new InstallException("설치 중 예외가 발생함");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외가 발생함");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }


    static void startInstall() throws SpaceException2, MemoryException2 {
        if(!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 없다");
        }
        if(!enoughMemory()) {
            throw new MemoryException2("메모리가 부족하다");
//            throw new RuntimeException(new MemoryException2("메모리가 부족하다"));
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





class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}
