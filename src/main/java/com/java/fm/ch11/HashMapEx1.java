package com.java.fm.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();      // 제네릭 타입을 명시적으로 지정해서 경고 해결.
        // HashMap map = new HashMap(); : Raw type 사용 -> Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap' 타입 안정성을 보장할 수 없어서 경고 뜸.
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("id와 pw를 입력.");
            System.out.print("id : ");
            String id = s.nextLine().trim();
            System.out.print("pw : ");
            String pw = s.nextLine().trim();
            System.out.println();

            if (!(map.containsKey(id))) {
                System.out.println("입력한 id는 존재하지 않음. 다시 입력.");
                continue;
            }
            if (!(map.get(id).equals(pw))) {
                System.out.println(map.get(id));
                System.out.println("pw가 일치하지 않음. 다시 입력.");
            } else {
                System.out.println("id, pw가 일치함.");
                break;
            }
        }
    }
}
