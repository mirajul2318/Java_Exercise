package LabProblem;

import java.util.Scanner;

public class MonthDaysFinder {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12) : ");
        int month = Sc.nextInt();

        System.out.print("Enter year: ");
        int year = Sc.nextInt();

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                // Leap year check
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month number!");
                return;
        }

        System.out.println("Number of days in month " + month + " of year " + year + " is : " + days);
    }
}
