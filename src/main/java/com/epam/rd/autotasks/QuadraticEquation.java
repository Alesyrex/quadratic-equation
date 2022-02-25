package com.epam.rd.autotasks;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {

    private static final double DEGREE = 2;
    private static final double MULTIPLIER_OF_D = 4;
    private static final double MULTIPLIER_OF_X = 2;

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private boolean noRoots;

    public void setA(double inA) {
        a = inA;
    }
    public void setB(double inB) {
        b = inB;
    }
    public void setC(double inC) {
        c = inC;
    }

    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }
    public boolean getNoRoots() {
        return noRoots;
    }

    private double discriminant () {
        return pow(b, DEGREE) - MULTIPLIER_OF_D * a * c;
    }

    public void rootCalculation () {
        if (discriminant() < 0) {
            noRoots = true;
        } else if (discriminant() > 0) {
            x1 = ((-b) - sqrt(discriminant())) / (MULTIPLIER_OF_X * a);
            x2 = ((-b) + sqrt(discriminant())) / (MULTIPLIER_OF_X * a);
        } else {
            x1 = -(b / (MULTIPLIER_OF_X * a));
            x2 = -(b / (MULTIPLIER_OF_X * a));
        }
    }

    public static void main(String[] args) {

        QuadraticEquation equation = new QuadraticEquation();
        InOutData.inputData(equation);
        equation.rootCalculation();
        InOutData.printRoot(equation);
    }
}
