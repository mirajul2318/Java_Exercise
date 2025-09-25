package W3resourseBasic;

import java.util.Scanner;

public class BinarytoOctalConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a binary Number : ");
        String b = Sc.nextLine();
        int d = Integer.parseInt(b,2);
        String o = Integer.toOctalString(d).toUpperCase();
        System.out.println("Octal number is : " + o);
    }
}
