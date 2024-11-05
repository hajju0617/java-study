package com.java.fm.ch4;

public class JavaSwitchExpression {
    public static void main(String[] args) {
        /*
        java 12 이후부터는 switch 문에서 Expression (표현식)을 사용할 수 있게 되었다.
        break 문을 없애는 대신에 화살표와 중괄호를 사용해 가독성이 좋아짐
        switch expression 을 사용하면 스위치된 값을 변수에 바로 대입할 수 있음
        단일 값의 경우에는 화살표 오른쪽에 값을 기술하면 되고,
        중괄호를 사용할 경우는 yield(java 13부터 가능)키워드로 값을 지정하면 된다. (즉, yield는 값을 반환하는 역할)
        단, 이 경우에는 default 가 반드시 존재해야 함

        자바 switch 표현식에서 괄호 안에 들어갈 수 있는 타입은 다음과 같습니다.
        1.정수 타입(int, byte, short, char)
         -> switch 문의 괄호 안에는 정수 타입만 올 수 있습니다.
         -> char 타입의 경우, char 값을 int 타입으로 변환하여 switch 문에 사용됩니다.
        2.enum 타입
         -> enum 타입의 경우, 각 enum 상수는 switch 문의 case 레이블로 사용될 수 있습니다.
        3.String 타입
         -> 자바 7부터 추가된 기능으로, String 타입도 switch 문의 괄호 안에 올 수 있습니다.
            각 case 레이블은 문자열 리터럴로 작성되어야 합니다.

        타입 변수 = switch() {
            case 값1 -> 변수값;
            case 값2 -> {
               ....
               yield 변수값;
            }
            default -> 변수값
        };
         */
        String grade = "B";
        int score = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.printf("score = %d\n", score);
    }
}
