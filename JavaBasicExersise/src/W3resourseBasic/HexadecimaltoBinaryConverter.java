package W3resourseBasic;

import java.util.Scanner;

public class HexadecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a hexadecimal number : ");
        String hex = Sc.nextLine();
        int d = Integer.parseInt(hex,16);
        String b = Integer.toBinaryString(d);
        System.out.println("Equivalent Binary number is : " + b);
    }
}
