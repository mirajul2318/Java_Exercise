package LabProblem;

import java.util.Scanner;

public class ATMDenominationCheck {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        int amount = Sc.nextInt();

        if (amount % 100 == 0) {
            System.out.println("This amount can be dispensed using ₹500, ₹200, ₹100 notes.");
        }
        else {
            System.out.println("Invalid amount. ATM can only dispense in ₹100, ₹200, or ₹500 notes.");
        }
    }
}
