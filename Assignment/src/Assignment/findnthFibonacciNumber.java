package Assignment;

import java.util.Scanner;

public class findnthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! n must be >= 0.");
        } else if (n == 0) {
            System.out.println("Fibonacci number at position 0 is: 0");
        } else if (n == 1) {
            System.out.println("Fibonacci number at position 1 is: 1");
        } else {
            int a = 0, b = 1, fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println("Fibonacci number at position " + n + " is : " + b);
        }

    }
}
