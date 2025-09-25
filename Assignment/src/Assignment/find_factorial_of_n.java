package Assignment;

import java.util.Scanner;

public class find_factorial_of_n {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        int n = Sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial : " + fact);
    }
}
