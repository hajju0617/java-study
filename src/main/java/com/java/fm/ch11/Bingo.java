package com.java.fm.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
//        Set set = new HashSet();            // 저장된 순서를 보장하지 않고 자체적인 저장방식으로 순서를 결정.
        Set set = new LinkedHashSet();    // 그래서 이 경우 LinkedHashSet이 더 나은 선택이 됨.
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 50) + 1 + "");
        }
        Iterator it = set.iterator();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());     // next()의 반환값이 Object이므로.
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
