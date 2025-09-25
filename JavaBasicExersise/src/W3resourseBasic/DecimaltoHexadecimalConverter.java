package W3resourseBasic;

import java.util.Scanner;

public class DecimaltoHexadecimalConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int d = Sc.nextInt();
        String b = Integer.toHexString(d);
        System.out.println("Hexadecimal number is : " + b);
    }
}
