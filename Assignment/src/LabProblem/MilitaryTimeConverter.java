package LabProblem;

import java.util.Scanner;

public class MilitaryTimeConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter hour (1-12) : ");
        int hour = Sc.nextInt();

        System.out.print("Enter minute (0-59) : ");
        int minute = Sc.nextInt();

        System.out.print("AM or PM : ");
        String ampm = Sc.next().toUpperCase();

        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        }
        else if (ampm.equals("PM")) {
            if (hour != 12) {
                hour += 12;
            }
        }

        System.out.printf("24-hour format: %02d:%02d\n", hour, minute);
    }
}
