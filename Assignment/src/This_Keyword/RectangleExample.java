public class RectangleExample {
    static class Rectangle {
        int width, height;

        Rectangle() {
            this(0, 0);
        }

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println("Rectangle1: " + r1.width*r1.height);
        System.out.println("Rectangle2: " + r2.width*r2.height);
    }
}
