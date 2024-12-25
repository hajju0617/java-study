package com.java.fm.ch8;
import java.io.*;
public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = new File(args[0]);
            System.out.println(f.getName() + "파일이 정상적으로 생성되었음.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 시도.");
        }
    }
    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않음.");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
