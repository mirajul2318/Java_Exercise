package LabProblem;

import java.util.Scanner;

public class LargestAmongThreeUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Largest number is : " + largest);
    }
}
