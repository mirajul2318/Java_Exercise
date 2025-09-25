package W3resourseBasic;

import java.util.Scanner;

public class CountDivisiblesinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x (start of range) : ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y (end of range) : ");
        int y = scanner.nextInt();

        System.out.print("Enter the value of p (divisor) : ");
        int p = scanner.nextInt();

        int count = 0;
        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                count++;
            }
        }

        System.out.println("Number of integers divisible by " + p + " between " + x + " and " + y + " is: " + count);
    }
}
