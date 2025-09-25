package Assignment;

import java.util.Scanner;

public class Digitspellingusingifelse {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a single digit : ");
        int digit = Sc.nextInt();
        if(digit==1)
            System.out.println("Digit spelling is : One");
        else if(digit==2)
            System.out.println("Digit spelling is : Two");
        else if(digit==3)
            System.out.println("Digit spelling is : Three");
        else if(digit==4)
            System.out.println("Digit spelling is : Four");
        else if(digit==5)
            System.out.println("Digit spelling is : Five");
        else if(digit==6)
            System.out.println("Digit spelling is : Six");
        else if(digit==7)
            System.out.println("Digit spelling is : Seven");
        else if(digit==8)
            System.out.println("Digit spelling is : Eight");
        else if(digit==9)
            System.out.println("Digit spelling is : Nine");
        else if(digit==0)
            System.out.println("Digit spelling is : Zero");
        else
            System.out.println("Not a valid digit");
    }
}
