package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = pow(b,2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("no roots");
        } else if (discriminant == 0) {
            double x = -(b / (2 * a));
            System.out.println(x);
        } else {
            double x1 = ((-b) - sqrt(discriminant)) / (2 * a);
            double x2 = ((-b) + sqrt(discriminant)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
    }

}