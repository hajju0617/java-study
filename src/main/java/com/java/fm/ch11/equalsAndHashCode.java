package com.java.fm.ch11;

import java.util.HashMap;

public class equalsAndHashCode {
    public static void main(String[] args) {
        HashMap<PersonTest, String> map = new HashMap<>();

        PersonTest p1 = new PersonTest("Hajju");
        PersonTest p2 = new PersonTest("Hajju");
        System.out.println("p1.equals(p2) : " + p1.equals(p2));

        map.put(p1, "Java");
        map.put(p2, "Spring");      // 동일한 name이지만 다른 객체로 인식 (hashCode() 오버라이딩 안 했을 시)
                                    // 동일한 name이므로 같은 객체로 인식 (hashCode() 오버라이딩 했을 시)

        System.out.println("map.size() : " + map.size());   // (hashCode() 오버라이딩 안 했을 시) -> 결과 : 2 (잘못된 결과)
                                                            // (hashCode() 오버라이딩 했을 시) -> 결과 : 1 (옳은 결과)
    }
}

class PersonTest {
    String name;

    PersonTest(String name) {
        this.name = name;
    }

    // equals() 재정의
    @Override
    public boolean equals(Object o) {
        if (o instanceof PersonTest) {
            PersonTest p = (PersonTest) o;
            return this.name.equals(p.name);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();     // name이 같으면 같은 해시값 반환
    }
}
