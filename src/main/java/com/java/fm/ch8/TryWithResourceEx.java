package com.java.fm.ch8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException we) {
            we.printStackTrace();
        } catch (CloseException ce) {
            ce.printStackTrace();
        }
        // CloseException 발생.
        System.out.println();
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException we) {
            we.printStackTrace();
        } catch (CloseException ce) {
            ce.printStackTrace();
        }
        // WorkException 발생. + Suppressed(억제된) CloseException 발생.
    }
}
class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork (" + exception + ") 가 호출 됨.");
        if (exception) {
            throw new WorkException("WorkException 발생.");
        }
    }
    public void close() throws CloseException {
        System.out.println("close()가 호출됨.");
        throw new CloseException("CloseException 발생.");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}
class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}