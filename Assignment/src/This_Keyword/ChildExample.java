public class ChildExample {
    static class Parent {
        void display() {}
    }

    static class Child extends Parent {
        void display() {
            System.out.println("Child hashCode: " + this.hashCode());
        }
    }

    public static void main(String[] args) {
        new Child().display();
    }
}
