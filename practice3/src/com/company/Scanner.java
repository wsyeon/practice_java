package com.company;

public class Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(); // Scanner 클래스의 객체를 생성

        System.out.print("두자리의 정수를 하나 입력해주세요.>");
        String input = scanner.toString();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.printf("입력내용 : %s", input);
        System.out.printf("num = %d\n", num);
    }
}
