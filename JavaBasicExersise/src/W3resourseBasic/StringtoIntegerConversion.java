package W3resourseBasic;

import java.util.Scanner;

public class StringtoIntegerConversion {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a number(string) : ");
        String str = Sc.nextLine();

        int num = Integer.parseInt(str);
        System.out.println("The integer value is : " + num);
    }
}
