package W3resourseBasic;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Input first integer : ");
        int a = Sc.nextInt();

        System.out.print("Input second integer : ");
        int b = Sc.nextInt();

        if(a==b)
            System.out.println(a + " = "+ b);
        if(a!=b)
            System.out.println(a + " != "+ b);
        if(a>b)
            System.out.println(a + " > "+ b);
        if(a<b)
            System.out.println(a + " < "+ b);
        if(a>=b)
            System.out.println(a + " >= "+ b);
        if(a<=b)
            System.out.println(a + " <= "+ b);
    }
}
