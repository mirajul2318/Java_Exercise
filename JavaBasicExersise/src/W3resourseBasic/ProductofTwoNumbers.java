package W3resourseBasic;

import java.util.Scanner;

public class ProductofTwoNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b;
        System.out.print("Input first number : ");
        a = Sc.nextInt();
        System.out.print("Input second number : ");
        b = Sc.nextInt();
        int mul = a*b;
        System.out.println(a + " X " + b + " = " + mul);
    }
}
