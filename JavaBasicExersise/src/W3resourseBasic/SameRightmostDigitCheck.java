package W3resourseBasic;

import java.util.Scanner;

public class SameRightmostDigitCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number (a) : ");
        int a = input.nextInt();

        System.out.print("Input second number (b) : ");
        int b = input.nextInt();

        System.out.print("Input third number (c) : ");
        int c = input.nextInt();

        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        boolean result = (aLast == bLast) || (aLast == cLast) || (bLast == cLast);

        System.out.println("The result is : " + result);
    }
}
