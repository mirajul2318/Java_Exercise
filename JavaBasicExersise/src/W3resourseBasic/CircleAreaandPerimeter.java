package W3resourseBasic;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter radious : ");
        double r = Sc.nextDouble();
        double per = 2*3.1416*r;
        double area = 3.1416*r*r;
        System.out.println("Perimeter is = " + per);
        System.out.println("Area is = " + area);
    }
}
