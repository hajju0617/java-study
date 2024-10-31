package com.java.fm.ch4;

import java.util.Scanner;
public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("주민번호를 입력하세요. (ex. 123456-1234567) : ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);      // 입력한 문자에서 8번째 문자를 추출. ( charAt(index)에서 index는 0부터 시작 )

        switch (gender) {
            case '1', '3' :
                switch (gender) {
                    case '1' :
                        System.out.println("2000년 이전에 출생한 남자.");
                        break;
                    case '3' :
                        System.out.println("2000년 이후에 출생한 남자.");
                        break;
                }
                break;      // 빼먹지 않도록 주의해야 하는 break;
            case '2', '4' :
                switch (gender) {
                    case '2' :
                        System.out.println("2000년 이전에 출생한 여자.");
                        break;
                    case '4' :
                        System.out.println("2000년 이후에 출생한 여자.");
                        break;
                }
                break;
            default:
                System.out.println("유효하지 않은 주민번호.");
        }

        // Switch Expressions
        String strGender = switch (gender) {
            case '1', '3' -> switch (gender) {
                case '1' -> "2000년 이전에 태어난 남자.";
                default -> "2000년 이후에 태어난 남자.";
            };
            case '2', '4' -> switch (gender) {
                case '2' -> "2000년 이전에 태어난 여자.";
                default -> "2000년 이후에 태어난 여자";
            };
            default -> "유효하지 않은 주민번호";
        };
        System.out.println(strGender);

    }

}

//public static void main(String[] args) {
//    System.out.print("당신의 주민등록번호를 입력하세요. (******-*******) :");
//    Scanner scan = new Scanner(System.in);
//    String regNo = scan.nextLine();
//    char gender = regNo.charAt(7);
//    String result,gender2;
//    switch (gender) {
//        case '1','3' -> {
//            switch (gender) {
//                case '1' -> result = "남자이고 2000년 이전에";
//                default -> result = "남자이고 2000년 이후에";
//            }
//        }
//        case '2','4' -> {
//            switch (gender) {
//                case '2' -> result = "여자이고 2000년 이전에";
//                default -> result = "여자이고 2000년 이후에";
//            }
//        }
//        default -> result = "알 수 없는 년도에";
//    }
//    System.out.printf("당신은 %s 출생한 사람입니다.", result);
//}
