package Final_Examination;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int n = Sc.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j = i-1; j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
        for(int i = n-1; i>=1;i--){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j = i-1; j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
