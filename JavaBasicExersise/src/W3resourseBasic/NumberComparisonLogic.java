package W3resourseBasic;

import java.util.Scanner;

public class NumberComparisonLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter second number (b): ");
        int b = input.nextInt();

        System.out.print("Enter third number (c): ");
        int c = input.nextInt();

        System.out.print("Is abc true? (true/false): ");
        boolean abc = input.nextBoolean();

        boolean result;

        if (abc) {
            result = (c > b);
        } else {
            result = (b > a && c > b);
        }

        System.out.println("Result: " + result);
    }
}
