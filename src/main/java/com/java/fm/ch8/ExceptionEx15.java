package com.java.fm.ch8;
import java.io.*;

public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println( f.getName() + " 파일이 성공적으로 생성");
    }

    static File createFile (String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않음");
            }
        } catch (Exception e) {
            fileName = "부적절.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile (File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {

        }
    }
}
