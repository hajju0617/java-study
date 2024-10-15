package com.java.fm.ch11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek();        // Stack에 저장된 마지막 요소를 읽어옴.

        // 만약 Stack이 비어있으면 peek() 메서드가 EmptyStackException을 발생시킴.
        // 마자막 요소를 삭제함. 배열의 index가 0부터 시작하므로 1을 빼줌.
        removeElement(size() - 1);
        return obj;
    }

    public Object peek() {
        int len = size();

        if (len == 0) {
            throw new EmptyStackException();
        }
        // 마지막 요소를 반환함. 배열의 index가 0부터 시작하므로 1을 빼줌.
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        // 끝에서부터 객체를 찾음.
        // 반환값은 저장된 위치 (배열의 index)임.
        int i = lastIndexOf(o);


        if (i >= 0) {   // 객체를 찾은 경우
            return size() - 1;      // Stack은 맨 위에 저장된 객체의 index를 1로 정의하기 때문에 계산을 통해서 구함.
        }
        return -1;      // 해당 객체를 찾지 못하면 -1를 반환함.
    }
}
