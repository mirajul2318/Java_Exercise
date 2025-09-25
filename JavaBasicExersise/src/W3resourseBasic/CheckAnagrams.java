package W3resourseBasic;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String-1: ");
        String str1 = scanner.nextLine();

        System.out.print("String-2: ");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);

        System.out.println("Check if two given strings are anagrams or not?: " + result);
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
