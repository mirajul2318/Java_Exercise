package W3resourseBasic;

import java.util.Scanner;

public class CommonDigitinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number (25-75) : ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number (25-75) : ");
        int num2 = scanner.nextInt();

        if ((num1 < 25 || num1 > 75) || (num2 < 25 || num2 > 75)) {
            System.out.println("Both numbers must be between 25 and 75.");
            return;
        }

        int num1FirstDigit = num1 / 10;
        int num1SecondDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2SecondDigit = num2 % 10;

        boolean result = (num1FirstDigit == num2FirstDigit) ||
                (num1FirstDigit == num2SecondDigit) ||
                (num1SecondDigit == num2FirstDigit) ||
                (num1SecondDigit == num2SecondDigit);

        System.out.println("Result: " + result);
    }
}
