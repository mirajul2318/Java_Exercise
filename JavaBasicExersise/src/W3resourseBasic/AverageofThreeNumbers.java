package W3resourseBasic;

import java.util.Scanner;

public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three number : ");
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();
        int sum = a+b+c;
        double avg = (double) sum /3 ;
        System.out.println("Averege value = " + avg);
    }
}
