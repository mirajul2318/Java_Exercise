package W3resourseBasic;

import java.util.Scanner;

public class CheckSubtractionDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = scanner.nextInt();

        System.out.print("Input the second number : ");
        int b = scanner.nextInt();

        System.out.print("Input the third number : ");
        int c = scanner.nextInt();

        boolean result =
                Math.abs(a - b) >= 20 ||
                        Math.abs(a - c) >= 20 ||
                        Math.abs(b - c) >= 20;

        System.out.println(result);
    }
}
