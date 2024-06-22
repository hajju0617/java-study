package com.java.fm.ch6;

public class TvTest {

    public static void main(String[] args) {
        Tv235 tv235 = new Tv235();
        tv235.channel = 7;
        tv235.channelUp();

        System.out.println("현재 채널은" + tv235.channel + "입니다.");

    }
}

class Tv235 {
    String color;
    int channel;
    boolean power;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}




        /*
        void와 return의 개념
        void
        void는 자바에서 메소드가 아무런 값을 반환하지 않을 때 사용하는 키워드
        void 키워드를 사용한 메소드는 호출 후 결과 값을 받을 수 없으며, 주로 어떤 작업을 수행만 하고 끝나는 경우에 사용

        return
        return은 메소드에서 특정 값을 호출한 곳으로 반환할 때 사용하는 명령어입니다.
        return 다음에 반환하고자 하는 값이 위치하며, 이 값의 타입은 메소드 선언 시 지정한 반환 타입과 일치해야 합니다.

        차이점
        기본적으로 void와 return은 메소드의 반환 유형을 정의하는 데 사용되는데
        void는 반환 값이 없음을 의미하고, return은 특정 값을 반환함을 의미합니다.
        void 메소드는 return 문을 생략할 수 있지만, 값 이 반환되는 메소드에서는 return 문을 반드시 포함해야 합니다.

        외부
        코드에서 '외부'라는 용어는 보통 메소드가 속한 클래스나 객체 외부를 의미
        즉, 메소드를 호출하고 그 결과를 사용하는 쪽을 말합니다.
        예를 들어, 어떤 클래스의 메소드를 다른 클래스에서 호출했다면, 그 호출한 클래스는 메소드에 대한 '외부'로 간주됩니다.

        반환값
        '반환값'은 메소드가 외부에 제공하는 결과 값입니다
        메소드가 수행한 계산의 결과나 메소드 내부에서 생성된 객체 등이 될 수 있습니다.
        메소드가 작업을 수행한 후 그 결과를 호출한 곳으로 전달하기 위해 사용됩니다.
        반환값이 있을 경우, 메소드는 return 키워드를 사용하여 이 값을 반환합니다.

        public void printMessage() {
            System.out.println("Hello, World!");
        }
        이 메소드는 "Hello, World!"를 화면에 출력하고 값을 반환하지 않습니다.

        public int add(int a, int b) {
            return a + b;
        }
        이 메소드는 두 정수를 더한 결과를 반환합니다.

        객체 외부란?
        객체 외부는 해당 객체가 속한 범위나 클래스 외부를 의미
        예를 들어, 어떤 클래스 내부에 정의된 메소드는 그 클래스의 인스턴스(객체)의 일부
        이 메소드를 다른 클래스에서 호출하거나, 클래스 인스턴스를 통해 접근하는 경우, 이러한 접근을 하는 곳을 '객체 외부'라고 합니다.
        public class Calculator {
            public int add(int a, int b) {
                return a + b;
            }
        }
        public class Main {
            public static void main(String[] args) {
                Calculator calc = new Calculator();
                int result = calc.add(5, 3);  // 여기에서 'calc.add(5, 3)'는 Calculator 객체 외부에서 호출됩니다.
                System.out.println("결과: " + result);
            }
        }
        여기서 Main 클래스는 Calculator 객체의 외부입니다. Main 클래스의 main 메소드에서 Calculator 클래스의 add 메소드를 호출하고 있으며, 이러한 상황에서 Main 클래스는 add 메소드에 대한 객체 외부로 간주됩니다.
         */
