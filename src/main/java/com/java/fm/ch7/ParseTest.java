package com.java.fm.ch7;

public class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class ParseManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing complements");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing complements");
    }
}