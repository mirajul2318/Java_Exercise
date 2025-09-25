package W3resourseBasic;

import java.util.Scanner;

public class InputandDisplayPassword {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input your Password : ");
        String str = Sc.nextLine();
        System.out.println("Your password was : " + str);
    }
}
