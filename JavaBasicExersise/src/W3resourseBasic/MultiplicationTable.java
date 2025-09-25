package W3resourseBasic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Sc.nextInt();
        for(int i=1;i<=10;i++){
           int result = n*i;
            System.out.println(n + " X " + i + " = " + result);
            result = 0;
        }
    }
}
