package com.java.fm.ch9;

import java.util.*;
import static java.util.Objects.*;
public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.print("str2D = {");
        for (String[] tmp : str2D) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.print("str2D_2 = {");
        for (String[] tmp : str2D_2) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.println("equals(str2D, str2D_2) = " + Objects.equals(str2D, str2D_2));
        System.out.println("equals(str2D, str2D_2) = " + Objects.deepEquals(str2D, str2D_2));   // deepEquals는 객체를 재귀적으로 비교해서 다차원 배열의 비교도 가능.


        System.out.println("inNull (null) = " + isNull(null));
        System.out.println("nonNull (null) = " + nonNull(null));
        System.out.println("hashCode (null) = " + Objects.hashCode(null));
        System.out.println("toString (null) = " + Objects.toString(null));
        System.out.println("toString (null, \"\") = " + Objects.toString(null, ""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;   // 대소문자 구분 안 하는 비교.

        System.out.println("compare (\"aa\", \"bb\") = " + compare("aa", "bb", c));     // compare() : 두 비교 대상이 같으면 0, 크면 양수, 작으면 음수 반환
        System.out.println("compare (\"bb\", \"aa\") = " + compare("bb", "aa", c));     // 해당 메서드는 두 객체를 비교하는데 비교 기준의 여할을 하는 것이 Comparator
        System.out.println("compare (\"ab\", \"AB\") = " + compare("ab", "AB", c));

    }
}
