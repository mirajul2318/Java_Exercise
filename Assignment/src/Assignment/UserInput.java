package Assignment;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input your name : ");
        String name = Sc.nextLine();
        System.out.println("Hello " + name);
    }
}
