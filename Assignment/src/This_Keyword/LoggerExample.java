public class LoggerExample {
    static class Logger {
        static void log(Object obj) {
            System.out.println("Logging: " + obj.getClass().getSimpleName());
        }
    }

    static class Sample {
        void doSomething() {
            Logger.log(this);
        }
    }

    public static void main(String[] args) {
        new Sample().doSomething();
    }
}
