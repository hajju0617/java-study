package com.java.fm.ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;      // Queue에 최대 5개 저장되도록.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있음.");

        while (true) {
            System.out.print(">>");

            try {
                // 화면으로부터 라인단위로 입력 받음.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줌.");
                    System.out.println(" q or Q - 프로그램을 종료.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줌.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);    // 입력받은 명령어 저장.

                    // LinkedList의 내용을 보여줌.
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")) {
            } catch (Exception e) {
                System.out.println("입력 오류");
            }
        }

    }

    public static void save(String input) {
        if (!"".equals(input)) {        // queue에 저장
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {      // size()는 Collection 인터페이스에 정의
            q.remove();                 // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제.
        }
    }
}
