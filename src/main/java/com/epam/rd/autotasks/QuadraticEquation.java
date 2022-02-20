package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static final double DEGREE = 2;
    public static final double MULTIPLIEROFD = 4;
    public static final double MULTIPLIEROFX = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = pow(b,DEGREE) - MULTIPLIEROFD * a * c;
        if (discriminant < 0) {
            System.out.println("no roots");
        } else if (discriminant > 0) {
            double x1 = ((-b) - sqrt(discriminant)) / (MULTIPLIEROFX * a);
            double x2 = ((-b) + sqrt(discriminant)) / (MULTIPLIEROFX * a);
            System.out.println(x1 + " " + x2);
        } else {
            double x = -(b / (MULTIPLIEROFX * a));
            System.out.println(x);
        }
    }
}
