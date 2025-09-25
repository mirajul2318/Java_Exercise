package W3resourseBasic;

import java.util.Scanner;

public class OctaltoDecimalConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Decimal representation: " + decimal);
    }
}
