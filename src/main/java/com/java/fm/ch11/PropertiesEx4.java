package com.java.fm.ch11;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println("java.version : " + properties.getProperty("java.version"));
        System.out.println("user.language : " + properties.getProperty("user.language"));
        properties.list(System.out);
    }
}
