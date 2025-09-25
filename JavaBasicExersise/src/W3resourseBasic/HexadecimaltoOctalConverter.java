package W3resourseBasic;

import java.util.Scanner;

public class HexadecimaltoOctalConverter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a hexadecimal number : ");
        String hex = Sc.nextLine();
        int d = Integer.parseInt(hex,16);
        String o = Integer.toOctalString(d);
        System.out.println("Equivalent Octal number is : " + o);
    }
}
