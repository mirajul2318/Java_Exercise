public class EmployeeExample {
    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        void show() {
            Printer printer = new Printer();
            printer.printDetails(this);
        }
    }

    static class Printer {
        void printDetails(Employee e) {
            System.out.println("Employee Name: " + e.name);
        }
    }

    public static void main(String[] args) {
        new Employee("Priyanto").show();
    }
}
