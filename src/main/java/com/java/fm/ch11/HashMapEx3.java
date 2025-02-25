package com.java.fm.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {
        addPhoneNo("친구", "1자바", "010-111-1111");
        addPhoneNo("친구", "2자바", "010-222-2222");
        addPhoneNo("친구", "3자바", "010-333-3333");
        addPhoneNo("회사", "4대리", "010-444-4444");
        addPhoneNo("회사", "5대리", "010-555-5555");
        addPhoneNo("회사", "2대리", "010-666-6666");
        addPhoneNo("회사", "3과장", "010-777-777");
        addPhoneNo("지인", "010-888-8888");
        printList();
    }
    // 그룹을 추가.
    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
    }

    // 그룹에 전화번호를 추가.
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(tel, name);	        // 이름은 중복될 수 있으니 전화번호를 key로 저장.
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    // 전화번호부 전체를 출력.
    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
            System.out.println(" * "+e.getKey() + "[" + subSet.size() + "]");

            while(subIt.hasNext()) {
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    } // printList()
}
