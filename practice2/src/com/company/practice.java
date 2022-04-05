package com.company;

public class Practice {
    public static void main(String[] args) {

        int x = 10, y = 20;
        int tmp;

        System.out.println("x:" + x + " y:" + y);

        tmp = x; // tmp에 10 대입 따라서 tmp = 10
        x = y; // x값에 20 대입 x는 이제 20
        y = tmp; // tmp에는 10이 들어가 있으므로 y에 10 대입

        System.out.println("x:" + x + " y:" + y);

    }
}
