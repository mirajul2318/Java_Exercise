package LabProblem;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter two number : ");
        double num1 = Sc.nextDouble();
        double num2 = Sc.nextDouble();

        System.out.print("Chose a Operator (+,-,*,/) : ");
        char op = Sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.printf("Summation = " + (num1+num2));
                break;
            case '-':
                System.out.printf("Subtraction = " + (num1-num2));
                break;
            case '*':
                System.out.printf("Multiplicatin = " + (num1*num2));
                break;
            case '/':
                System.out.printf("Division = " + (num1/num2));
                break;
            default:
                System.out.println("Not a valid operator.");
        }
    }
}