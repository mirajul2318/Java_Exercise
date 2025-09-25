package W3resourseBasic;

import java.util.Scanner;

public class DecimaltoOctalConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int d = Sc.nextInt();
        String b = Integer.toOctalString(d);
        System.out.println("Octal number is : " + b);
    }
}
