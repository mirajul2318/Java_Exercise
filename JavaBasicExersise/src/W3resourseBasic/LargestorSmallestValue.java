package W3resourseBasic;

import java.util.Scanner;

public class LargestorSmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = scanner.nextInt();

        System.out.print("Input the second number: ");
        int b = scanner.nextInt();

        int result;

        if (a == b) {
            result = 0;  // যদি দুই সংখ্যা সমান হয়
        } else if (a % 6 == b % 6) {
            result = Math.min(a, b);  // রিমেইন্ডার সমান হলে ছোটটা রিটার্ন
        } else {
            result = Math.max(a, b);  // অন্যথায় বড়টা রিটার্ন
        }

        System.out.println("Result: " + result);
    }
}
