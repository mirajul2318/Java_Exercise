public class ComputerExample {
    static class Computer {
        void display() {
            System.out.println("Computer Display");
        }

        class Processor {
            void process() {
                Computer.this.display();
            }
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.process();
    }
}
