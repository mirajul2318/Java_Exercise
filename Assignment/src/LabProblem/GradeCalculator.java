package LabProblem;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter your mark : ");
        float mark = Sc.nextFloat();

        if(mark>=80){
            System.out.println("Your Grade is : A+");
        }
        else if(mark>=75){
            System.out.println("Your Grade is : A");
        }
        else if(mark>=70){
            System.out.println("Your Grade is : A-");
        }
        else if(mark>=65){
            System.out.println("Your Grade is : B+");
        }
        else if(mark>=60){
            System.out.println("Your Grade is : B");
        }
        else if(mark>=55){
            System.out.println("Your Grade is : B-");
        }
        else if(mark>=50){
            System.out.println("Your Grade is : C+");
        }
        else if(mark>=45){
            System.out.println("Your Grade is : C");
        }
        else if(mark>=40){
            System.out.println("Your Grade is : D");
        }
        else{
            System.out.println("Your Grade is : F");
        }
    }
}
