package Assignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int revNum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }

        if (num == revNum) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }

    }
}
