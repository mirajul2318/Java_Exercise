package Polymorphism;

class Shape{
    void show(){
        System.out.println("This is a Shape.");
    }
    void getInfo(){
        System.out.println("This is a Shape Class.");
    }
}

class Circle extends Shape{
    @Override
    void show() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape{
    @Override
    void show() {
        System.out.println("This is a Rectangle.");
    }
}

public class Problem_01 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.show();
        s2.show();

        System.out.println(" ");

        s1.getInfo();
        s2.getInfo();
    }
}
