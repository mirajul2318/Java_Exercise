package Inheritance_01;

class Person {
    String firstName = "John";
    String lastName = "Doe";

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String employeeId = "E101";
    String jobTitle = "Manager";

    String getEmployeeId() {
        return employeeId;
    }

    String getLastName() {
        return lastName ;
    }
}


public class Problem_07 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Person First Name: " + p.getFirstName());
        System.out.println("Person Last Name: " + p.getLastName());

        System.out.println();

        Employee e = new Employee();
        System.out.println("Employee First Name: " + e.getFirstName());
        System.out.println("Employee Last Name: " + e.getLastName());
        System.out.println("Employee Job Title : " + e.jobTitle);
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}
