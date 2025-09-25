package Inheritance_01;

class Employe {
    void work() {
        System.out.println("Work 12 hour per day.");
    }
    void getSalary() {
        System.out.println("You receive salary every month last.");
    }
}

class HRManager extends Employe {
    @Override
    void work() {
        System.out.println("HR Manager work 12 hour per day.");
    }
    void addEmploye() {
        System.out.println("Add a employe HR Manager.");
    }
}

public class Problem_04 {
    public static void main(String[] args) {
        Employe anyEmploye = new Employe();
        anyEmploye.work();
        anyEmploye.getSalary();

        HRManager manager = new HRManager();
        manager.work();
        manager.addEmploye();
    }
}
