package Assignment;

import java.util.Scanner;

public class Patternprogram {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter how many row you show : ");
        int n = Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print ("* ");
            }
            System.out.println(" ");
        }
    }
}
