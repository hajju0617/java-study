package com.java.fm.ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();     // Queue 인터페이스의 구현체 중 하나.
                                            // 저장순서 상관x 우선순위(priority)가 높은 것부터 꺼냄. null 저장 못함.

        pq.offer(3);    // pq.offer(new Integer(3)) 오토박싱.
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);

        System.out.println(pq);     // pg의 내부 배열을 출력함.

        Object obj = null;
        while ((obj = pq.poll()) != null) {     // 저장된 요소를 하나씩 출력.
            System.out.println(obj);            // 숫자가 작을수록 우선순위 높음.
        }
    }
}
