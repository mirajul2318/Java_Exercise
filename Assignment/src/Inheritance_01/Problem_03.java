package Inheritance_01;

class Shape {
    void getArea() {
        System.out.println("Shape Area.");
    }
}

class Rectangle extends Shape {
    void getArea(double a,double b) {
        System.out.println("Rectangle Area : " + (a*b));
    }
}

public class Problem_03 {
    public static void main(String[] args) {
        Shape anySape = new Shape();
        anySape.getArea();

        Rectangle RectangleArea = new Rectangle();
        double x = 10.0;
        double y = 20.0;
        RectangleArea.getArea(x,y);
    }
}
