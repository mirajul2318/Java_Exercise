package Assignment;

import java.util.Scanner;

public class printsumofoddnumbersfromm_n {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter start number : ");
        int m = Sc.nextInt();

        System.out.print("Enter end number : ");
        int n = Sc.nextInt();

        int sumOfOdd = 0;

        for(int i=m;i<=n;i++){
            if(i%2!=0)
                sumOfOdd = sumOfOdd + i;
        }
        System.out.println("Sum of Odd : " + sumOfOdd);
    }
}
