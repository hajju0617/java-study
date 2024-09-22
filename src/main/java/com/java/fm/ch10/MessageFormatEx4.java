package com.java.fm.ch10;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "data4.txt";
        String msg = "INSERT INTO " + tableName + " VALUES ({0}, {1}, {2}, {3});";

        Scanner s = new Scanner(new File(fileName));
        // 디렉토리에 data4.txt 파일이 있어야 함.
        // Run -> edit configurations -> Working directory 에서 data4.txt 파일 위치 설정

        String pattern = "{0}, {1}, {2}, {3}";
        MessageFormat mf = new MessageFormat(pattern);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }
        s.close();      // 작업이 끝나면 Scanner 에서 사용한 파일을 닫아줌.
    }
}
