package W3resourseBasic;

import java.util.Scanner;

public class SumEqualsThirdInteger {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = Sc.nextInt();

        System.out.print("Input the second number : ");
        int b = Sc.nextInt();

        System.out.print("Input the third number : ");
        int c = Sc.nextInt();

        if((a+b)==c)
            System.out.println("The result is: true ");
    }
}
