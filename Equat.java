package com.company;

import java.util.Scanner;

public class Equat {
    static double x;
    static double y;

    public Equat() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        x = scanner.nextDouble();
        System.out.println("Введите y:");
        y = scanner.nextDouble();
        double results = divnumbers(x, y);
        System.out.println(results);
    }

    public static double divnumbers(double x, double y) {
        return 3.0D * (x + 2.0D * x - y) / 2.0D * x;
    }
}
