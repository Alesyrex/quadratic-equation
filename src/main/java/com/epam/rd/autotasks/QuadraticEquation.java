package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {

    private static final double DEGREE = 2;
    private static final double MULTIPLIER_OF_D = 4;
    private static final double MULTIPLIER_OF_DENOMINATOR = 2;

    private final double a;
    private final double b;
    private final double c;
    private double x1;
    private double x2;

    public QuadraticEquation(double inA, double inB, double inC) {
        a = inA;
        b = inB;
        c = inC;
    }

    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }

    public double calculationDiscriminant() {
        return pow(b, DEGREE) - MULTIPLIER_OF_D * a * c;
    }

    public void calculationRoots() {
        double denominator = MULTIPLIER_OF_DENOMINATOR * a;

        if (calculationDiscriminant() > 0) {
            x1 = ((-b) - sqrt(calculationDiscriminant())) / denominator;
            x2 = ((-b) + sqrt(calculationDiscriminant())) / denominator;
        } else {
            x1 = -(b / denominator);
            x2 = x1;
        }
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }
        InOutData out = new InOutData();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.calculationRoots();
        out.printRoots(equation);
    }
}
