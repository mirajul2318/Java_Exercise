package Assignment;

import java.util.Scanner;

public class LogicalANDassignmentandif_else {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Input first number : ");
        int num1 = Sc.nextInt();

        System.out.print("Input second number : ");
        int num2 = Sc.nextInt();

        System.out.print("Input third number : ");
        int num3 = Sc.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println("Number : " + num1);
        else if(num2>num1 && num2>num3)
            System.out.println("Number : " + num2);
        else
            System.out.println("Number : " + num3);
    }
}
