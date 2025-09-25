package W3resourseBasic;

import java.util.Scanner;

public class ConverttoLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a String: ");
        String input = scanner.nextLine();

        String lowerCaseString = input.toLowerCase();

        System.out.println("Lowercase String:");
        System.out.println(lowerCaseString);
    }
}
