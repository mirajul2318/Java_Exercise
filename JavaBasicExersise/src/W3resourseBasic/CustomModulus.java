package W3resourseBasic;

import java.util.Scanner;

public class CustomModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = scanner.nextInt();

        System.out.print("Input the second number : ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient = a / b;
        int remainder = a - (quotient * b);

        System.out.println("Modulus : " + remainder);
    }
}
