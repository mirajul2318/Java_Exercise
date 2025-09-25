package W3resourseBasic;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Input a string : ");
        String str = Sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string : " + rev);
    }
}
