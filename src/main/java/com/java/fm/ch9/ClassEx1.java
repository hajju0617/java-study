package com.java.fm.ch9;

public class ClassEx1 {
    public static void main(String[] args) throws Exception{
        Card c = new Card("HEART", 3);
        Card c2 = Card.class.getDeclaredConstructor().newInstance();
        /*
        Card c2 = Card.class.newInstance(); 에서
        newInstance()이 버전9부터 사용을 못해서
        Card.class.getDeclaredConstructor().newInstance(); 이렇게 수정 하였고
        Class<?> cObj = c.getClass(); 추가하였다

        getDeclaredConstructor().newInstance()를 사용하면
        기본 생성자를 호출하여 객체를 생성할 수 있다.
        이 방법은 리플렉션을 사용하여 클래스의 인스턴스를 생성할 때 권장되는 방식.
         */
        String str = new String("dd");
        Class<?> cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}


final class Card {
    String kind;
    int num;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}

