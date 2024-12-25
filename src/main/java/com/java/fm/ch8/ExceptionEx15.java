package com.java.fm.ch8;
import java.io.*;

public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었음.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유요하지 않음.");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";          // 파일이름이 이상할 경우 "제목없음.txt"로 설정.
        } finally {
            File f = new File(fileName);
            createNewFile(f);               // 만든 객체를 이용해서 파일 생성.
            return f;
        }
    }
    static void createNewFile(File f) {
        try {
            f.createNewFile();      // 파일 생성.
        } catch (Exception e) {

        }
    }
}
