package W3resourseBasic;

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b;
        System.out.print("Input first number : ");
        a = Sc.nextInt();
        System.out.print("Input second number : ");
        b = Sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " X " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
    }
}
