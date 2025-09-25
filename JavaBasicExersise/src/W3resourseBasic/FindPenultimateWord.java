package W3resourseBasic;

import java.util.Scanner;

public class FindPenultimateWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a String: ");
        String sentence = scanner.nextLine().trim();

        String[] words = sentence.split("\\s+");

        if (words.length < 2) {
            System.out.println("Not enough words to find the penultimate word.");
        } else {
            String penultimate = words[words.length - 2];
            System.out.println("Penultimate word: " + penultimate);
        }
    }
}
