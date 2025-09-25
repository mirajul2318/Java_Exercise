package Assignment;

import java.util.Scanner;

public class Call_center_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ABC Call Center");
        System.out.println("Press 1 for Customer Support");
        System.out.println("Press 2 for Billing");
        System.out.println("Press 3 for Technical Support");
        System.out.println("Press 4 to Exit");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Connecting to Customer Support...");
                break;
            case 2:
                System.out.println("Redirecting to Billing Department...");
                break;
            case 3:
                System.out.println("Connecting to Technical Support...");
                break;
            case 4:
                System.out.println("Thank you for calling. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }

        sc.close();
    }
}
