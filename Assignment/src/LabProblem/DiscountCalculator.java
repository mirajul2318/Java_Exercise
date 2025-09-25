package LabProblem;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter purchase amount : ");
        double amount = Sc.nextDouble();

        double discount = 0;

        if (amount > 5000) {
            discount = amount * 0.20;
        }
        else if (amount > 1000) {
            discount = amount * 0.10;
        }
        else {
            discount = 0;
        }

        double totalPay = amount - discount;

        System.out.println("Discount : " + discount);
        System.out.println("Amount to pay after discount : " + totalPay);
    }
}
