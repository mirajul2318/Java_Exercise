package LabProblem;

import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter three number : ");
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        int num3 = Sc.nextInt();

        int max;

        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if(num2>num1 && num2>num3){
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("Largest NUmber : " + max);
    }
}
