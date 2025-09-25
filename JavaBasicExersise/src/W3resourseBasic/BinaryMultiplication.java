package W3resourseBasic;

import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = input.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = input.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int mul = num1 * num2;

        String binaryMul = Integer.toBinaryString(mul);

        System.out.println("Sum of two binary numbers: " + binaryMul);
    }
}
