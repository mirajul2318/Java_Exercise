package W3resourseBasic;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Enter five integer number : ");
        a = Sc.nextInt();
        b = Sc.nextInt();
        c = Sc.nextInt();
        d = Sc.nextInt();
        e = Sc.nextInt();
        System.out.println("Output : ");
        System.out.println(-a+b*c);
        System.out.println((c+d)%b);
        System.out.println(a+ -c*d/b);
        System.out.println(a+b-c*d);
    }
}
