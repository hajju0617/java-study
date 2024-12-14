package com.java.fm.ch6;

public class MainTest {
    public static void main(String[] args) {
        main(null);     // main() 메서드 호출 (재귀호출)
                            // main() 메서드가 종료되지 않고 호출스택에 계속 쌓임 => 스택오버플로우 발생.
    }
}
