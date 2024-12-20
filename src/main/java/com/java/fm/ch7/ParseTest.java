package com.java.fm.ch7;

public class ParseTest {
    public static void main(String[] args) {
        Parseable388 parser = ParserManager388.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager388.getParser("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable388 {        // 구문 분석 작업.
//    public abstract void parse(String fileName);
    void parse(String fileName);
}
class XMLParser388 implements Parseable388 {
    public void parse(String fileName) {
        System.out.println(fileName + "-> XML parsing completed");
    }
}
class HTMLParser388 implements Parseable388 {
    public void parse(String fileName) {
        System.out.println(fileName + "-> HTML parsing completed");
    }
}
class ParserManager388 {
    public static Parseable388 getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser388();
        } else {
//            Parseable388 p = new HTMLParser388();
//            return p;
            return new HTMLParser388();
        }
    }
}