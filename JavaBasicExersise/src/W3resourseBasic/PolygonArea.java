package W3resourseBasic;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon : ");
        double nside = scanner.nextDouble();

        System.out.print("Input the length of one of the sides : ");
        double lside = scanner.nextDouble();

        double area = (nside * Math.pow(lside, 2)) / (4 * Math.tan(Math.PI / nside));

        System.out.printf("The area is : %f\n", area);
    }
}
