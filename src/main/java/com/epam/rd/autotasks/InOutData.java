package com.epam.rd.autotasks;


public class InOutData {
    private static final String NO_ROOT = "no roots";
    private static final double EPSILON = 1E-16;

    public void printRoots (QuadraticEquation equation) {
        if (equation.calculationDiscriminant() < 0) {
            System.out.println(NO_ROOT);
        } else if (Math.abs(equation.getX1() - equation.getX2()) <= EPSILON) {
            System.out.println(equation.getX1());
        } else {
            System.out.println(equation.getX1() + " " + equation.getX2());
        }
    }
}
