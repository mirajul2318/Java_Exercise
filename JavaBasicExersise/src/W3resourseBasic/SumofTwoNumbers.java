package W3resourseBasic;
import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two integer Number : ");
        a = Sc.nextInt();
        b = Sc.nextInt();
        int Sum = a+b;
        System.out.print("Sum = ");
        System.out.println(Sum);
    }
}
