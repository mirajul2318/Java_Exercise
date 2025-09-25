package W3resourseBasic;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word : ");
        String word = scanner.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Reverse word : " + reversed);
    }
}
