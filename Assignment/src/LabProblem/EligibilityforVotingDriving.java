package LabProblem;

import java.util.Scanner;

public class EligibilityforVotingDriving {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = Sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote and drive.");
        }
        else if (age >= 16) {
            System.out.println("You are eligible to drive but not to vote.");
        }
        else {
            System.out.println("You are not eligible to vote or drive.");
        }
    }
}
