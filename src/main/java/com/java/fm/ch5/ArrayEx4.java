package com.java.fm.ch5;

public class ArrayEx4 {
    public static void main(String[] args) {
        // char[]은 print, println으로 배열에 저장된 모든 문자를 출력할 수 있음.
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
                        // abc[0]에서 result[0]으로. (abc.length개의 데이터 복사)
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
