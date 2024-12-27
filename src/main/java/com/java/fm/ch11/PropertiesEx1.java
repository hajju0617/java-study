package com.java.fm.ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        Enumeration e = properties.propertyNames();        // 저장된 요소들을 Enumeration을 이용해서 출력.
        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println(element + " = " + properties.getProperty(element));
        }
        System.out.println();
        properties.setProperty("size", "20");
        System.out.println("size = " + properties.getProperty("size"));
        System.out.println("capacity = " + properties.getProperty("size", "20"));
        System.out.println("loadfactor = " + properties.getProperty("loadfactor", "0.75"));
        System.out.println("properties = " + properties);       // properties에 저장된 요소 출력.
        System.out.println();
        properties.list(System.out);                            // properties에 저장된 요소들을 화면에 출력.
    }
}
