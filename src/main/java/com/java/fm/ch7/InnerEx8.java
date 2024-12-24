package com.java.fm.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {              // 이벤트 리스너 인터페이스를 구현하는 익명 클래스.
                                                                // (클래스 정의와 객체 생성을 동시에 수행.)
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}
