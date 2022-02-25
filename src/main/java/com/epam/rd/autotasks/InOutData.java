package com.epam.rd.autotasks;

import java.util.Scanner;

public class InOutData {
    private static final String NO_ROOT = "no roots";
    private InOutData() {
    }

    public static void printRoot (QuadraticEquation equation) {
        if (equation.getNoRoots()) {
            System.out.println(NO_ROOT);
        } else if (equation.getX1() == equation.getX2()) {
            System.out.println(equation.getX1());
        } else {
            System.out.println(equation.getX1() + " " + equation.getX2());
        }
    }

    public static void inputData (QuadraticEquation equation) {
        double a;
        double b;
        double c;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
    }
}
