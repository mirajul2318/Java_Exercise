package W3resourseBasic;

import java.util.Scanner;

public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int d = Sc.nextInt();
        String b = Integer.toBinaryString(d);
        System.out.println("Binary number is : " + b);
    }
}
