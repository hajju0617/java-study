package com.java.fm.ch5;

class ArrayEx17 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java ArrayEx15 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default :
                System.out.println("지원하지 않는 연산.");
        }

        System.out.println("결과 : " + result);
    }
}
// Run -> Edit Configurations -> 내가 적용할 자바 파일을 선택하고 Program arguments에 매개변수를 입력.
