package LabProblem;

import java.util.Scanner;

public class ProfitorLoss {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Cost Price : ");
        double cp = Sc.nextDouble();
        System.out.print("Enter Sells Price : ");
        double sp = Sc.nextDouble();

        if (sp > cp) {
            System.out.println("Profit : " + (sp - cp));
        } else if (sp < cp) {
            System.out.println("Loss: " + (cp - sp));
        } else {
            System.out.println("No Profit No Loss.");
        }
    }
}
