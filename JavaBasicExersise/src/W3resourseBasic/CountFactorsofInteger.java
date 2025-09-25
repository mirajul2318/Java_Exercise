package W3resourseBasic;

import java.util.Scanner;

public class CountFactorsofInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int num = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println("Number of factors of " + num + " is: " + count);
    }
}
