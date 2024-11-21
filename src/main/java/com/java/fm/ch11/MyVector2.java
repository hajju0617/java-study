package com.java.fm.ch11;
import java.util.*;

public class MyVector2 extends MyVector implements Iterator{
    int cursor = 0, lastRet = -1;

    public MyVector2(int capacity) {
        super(capacity);
    }

    public MyVector2() {
        this(10);
    }
    public String toString() {
        String tmp = "";
        Iterator it = iterator();
        for (int i = 0; it.hasNext(); i++) {
            if (i != 0) {
                tmp += ", ";
                tmp += it.next();   // tmp += next().toString();
            }
        }
        return "[" + tmp + "]";
    }
    public Iterator iterator() {
        cursor = 0;     // cursor, lastRet 초기화
        lastRet = -1;
        return this;
    }
    public boolean hasNext() {
        return cursor != size();
    }
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }
    public void remove() {
        if (lastRet == -1) {
            throw new IllegalStateException();  // 더 이상 삭제할 것이 없을 경우 IllegalStateException 발생시킴.
        } else {
            remove(lastRet);        // 최근에 읽어온 요소 삭제.
            cursor--;               // 삭제 후에 cursor의 위치를 감소시킴.
            lastRet = -1;           // lastRet 값 초기화.
        }
    }
}
