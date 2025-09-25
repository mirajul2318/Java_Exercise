package W3resourseBasic;

import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int num = Sc.nextInt();
        int sum=0,rem;
        while (num != 0){
           rem = num%10;
           sum = sum+rem;
           rem = 0;
           num = num/10;
        }
        System.out.println("The sum of the digits is : " + sum);
    }
}
