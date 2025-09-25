package W3resourseBasic;

import java.util.Scanner;

public class CheckEvenorOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = Sc.nextInt();
        if(num%2 == 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
