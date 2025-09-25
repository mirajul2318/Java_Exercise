package String_Problem;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(chars);

        System.out.println("Reversed string: " + reversed);
    }
}
