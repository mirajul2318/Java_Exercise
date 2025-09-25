package Assignment;

import java.util.Scanner;

public class validvoterusingifelse {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = Sc.nextInt();
        if(age >= 18){
            System.out.println("You are a valid voter.");
        }
        else {
            System.out.println("You are not a valid voter.");
        }
    }
}
