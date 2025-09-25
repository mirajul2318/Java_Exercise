public class CarExample {
    static class Car {
        String model, color;
        int speed;

        Car setModel(String model) {
            this.model = model;
            return this;
        }

        Car setColor(String color) {
            this.color = color;
            return this;
        }

        Car setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        void display() {
            System.out.println("Model: " + model + ", Color: " + color + ", Speed: " + speed);
        }
    }

    public static void main(String[] args) {
        new Car().setModel("BMW").setColor("Red").setSpeed(120).display();
    }
}
