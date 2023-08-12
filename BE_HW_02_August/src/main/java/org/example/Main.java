package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int res1 = a + b;
        System.out.println("Сумма:" + res1);

        int c = 10;
        int d = 5;
        int res2 = c-d;
        System.out.println("Разность:" + res2);

        int e = 3;
        int f = 4;
        int res3 = e * f;
        System.out.println("Результат умножения:" + res3);

        int g = 15;
        int h = 5;
        int res4 = g / h;
        System.out.println("Результат деления:" + res4);
    }
}