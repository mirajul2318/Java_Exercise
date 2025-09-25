public class LambdaExample {
    String name = "OuterClass";

    void testLambda() {
        Runnable r = () -> {
            System.out.println("Lambda sees this.name as: " + this.name);
        };
        r.run();
    }

    public static void main(String[] args) {
        new LambdaExample().testLambda();
    }
}
