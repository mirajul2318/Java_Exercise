package LabProblem;

import java.util.Scanner;

public class ValidTriangleChecker {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter angle 1 : ");
        int angle1 = Sc.nextInt();

        System.out.print("Enter angle 2 : ");
        int angle2 = Sc.nextInt();

        System.out.print("Enter angle 3 : ");
        int angle3 = Sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("This is a VALID triangle.");
        }
        else {
            System.out.println("This is NOT a valid triangle.");
        }
    }
}
