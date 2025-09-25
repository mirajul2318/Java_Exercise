public class CircleEx {
    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double calculateArea() {
            return Math.PI * radius * radius;
        }

        void display() {
            System.out.println("Area: " + this.calculateArea());
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}
