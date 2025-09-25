package W3resourseBasic;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number : ");
        a = Sc.nextInt();
        System.out.print("Enter second number : ");
        b = Sc.nextInt();
        System.out.println("Before Swap : " + a + "," +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : " + a + "," +b);
    }
}
