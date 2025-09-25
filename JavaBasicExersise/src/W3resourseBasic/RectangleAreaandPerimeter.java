package W3resourseBasic;

import java.util.Scanner;

public class RectangleAreaandPerimeter {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter width : ");
        double w = Sc.nextDouble();

        System.out.print("Enter height : ");
        double h = Sc.nextDouble();

        double per = 2*(w+h);
        double area = w*h;

        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + per);
    }
}
