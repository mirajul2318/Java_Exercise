package LabProblem;

import java.util.Scanner;

public class TriangleTypeChecke {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter three lengths : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}
