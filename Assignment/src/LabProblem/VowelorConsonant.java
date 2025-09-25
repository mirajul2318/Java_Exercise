package LabProblem;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter any character : ");
        char ch = Sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.println("Vowel.");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
