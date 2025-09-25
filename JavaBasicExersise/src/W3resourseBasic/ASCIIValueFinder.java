package W3resourseBasic;

import java.util.Scanner;

public class ASCIIValueFinder {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = Sc.next().charAt(0);
        int asciiValu = (int)ch;
        System.out.println("The ASCII value of Z is : " + asciiValu);
    }
}
