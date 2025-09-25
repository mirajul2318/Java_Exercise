package LabProblem;

public class Employee {
    public String name;
    private double salary;
    public Employee(String empName){
        name = empName;
    }
    public void setSalary(double empsal) {
        salary = empsal;
    }
    public void printEmp(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee empOne = new Employee("Mirajul Alam");
        Employee empTwo = new Employee("Akib Ilham");
        Employee empThree = new Employee("Fahad Morol");
        empOne.setSalary(1000d);
        empTwo.setSalary(900d);
        empThree.setSalary(1200d);
        empOne.printEmp();
        empTwo.printEmp();
        empThree.printEmp();
    }
}
