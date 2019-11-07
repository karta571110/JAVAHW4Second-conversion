package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        double s, m, h;

        System.out.println("請輸入秒數:");

        Scanner scanner = new Scanner(System.in);

        s = scanner.nextDouble();

        h = s / 3600;
        m = s / 60;


        System.out.println("你輸入的時間為" + Math.floor(h) + "時" + Math.floor(m % 60) + "分" + s % 60 + "秒");
    }
}
