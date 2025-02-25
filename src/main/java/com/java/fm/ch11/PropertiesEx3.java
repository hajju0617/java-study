package com.java.fm.ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "한글");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        try {
            properties.store(new FileOutputStream("output.txt"), "Properties Example");
            properties.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current working directory: " + System.getProperty("user.dir"));     // 절대 경로를 출력.
    }
}
