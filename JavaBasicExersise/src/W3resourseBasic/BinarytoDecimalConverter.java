package W3resourseBasic;

import java.util.Scanner;

public class BinarytoDecimalConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a binary Number : ");
        String b = Sc.nextLine();
        int d = Integer.parseInt(b,2);
        System.out.println("Decimal number is : " + d);
    }
}
