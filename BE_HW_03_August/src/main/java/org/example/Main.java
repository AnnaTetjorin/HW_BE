package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       double m = 10.5;
       double n = 10.45;
       solver1 (m, n);}
    public static void solver1 (double x, double y) {
        double res1;
        double res2;
        if (x<0) {
            x = Math.abs(x);
            res1 = 10+x;
            x = -x;}
        else{
            res1 = Math.abs(10-x);}
        if (y<0) {
            y = Math.abs(y);
            res2 = 10+y;
            y = -y;}
        else {
            res2 = Math.abs(10-y);}
        if (res1<res2) {
            System.out.println(x+ "Ближе к 10 чем" + y);}
        else if (res1==res2){
            System.out.println("Точки" + x + "и" + y + "равноудалены");}
        else {
            System.out.println(y + "Ближе к 10 чем" +x);
        }
    }
}