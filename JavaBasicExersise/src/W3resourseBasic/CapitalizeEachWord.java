package W3resourseBasic;

import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }

        System.out.println("Capitalized Sentence:");
        System.out.println(capitalizedSentence.toString().trim());
    }
}
