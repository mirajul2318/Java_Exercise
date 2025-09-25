package W3resourseBasic;

import java.util.HashSet;
import java.util.Scanner;

public class CheckDistinctCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Original String : ");
        String input = scanner.nextLine();

        HashSet<Character> seenChars = new HashSet<>();
        boolean isUnique = true;

        for (char ch : input.toCharArray()) {
            if (seenChars.contains(ch)) {
                isUnique = false;
                break;
            }
            seenChars.add(ch);
        }

        System.out.println("String has all unique characters : " + isUnique);
    }
}
