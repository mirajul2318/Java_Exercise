package LabProblem;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = Sc.nextLine();

        int length = password.length();

        if (length < 6) {
            System.out.println("Password Strength : WEAK");
        }
        else if (length >= 6 && length < 8) {
            System.out.println("Password Strength : MEDIUM");
        }
        else {
            System.out.println("Password Strength : STRONG");
        }
    }
}
