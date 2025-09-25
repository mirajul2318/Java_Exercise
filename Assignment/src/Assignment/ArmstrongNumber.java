package Assignment;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int newNum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            newNum = newNum + digit*digit*digit;
            temp = temp / 10;
        }

        if (num == newNum) {
            System.out.println(num + " is a Armstrong number.");
        } else {
            System.out.println(num + " is not a Armstrong number.");
        }
    }
}
