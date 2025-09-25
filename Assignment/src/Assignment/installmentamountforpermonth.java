package Assignment;

import java.util.Scanner;

public class installmentamountforpermonth {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter total amount : ");
        double total = Sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = Sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = Sc.nextInt();

        double monthlyRate = rate / 12 / 100;
        double emi = (total * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Monthly Installment (EMI): %.2f\n", emi);
    }
}
