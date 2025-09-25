package LabProblem;

import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        double a = Sc.nextDouble();
        System.out.print("Enter value of b : ");
        double b = Sc.nextDouble();
        System.out.print("Enter value of c : ");
        double c = Sc.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and different : ");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }
        else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal : ");
            System.out.println("Root1 = Root2 = " + root);
        }
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are imaginary (complex):");
            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
