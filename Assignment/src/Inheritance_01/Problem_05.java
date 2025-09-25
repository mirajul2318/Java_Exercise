package Inheritance_01;

class BankAccount {
    void deposit() {
        System.out.println("Amount your deposite.");
    }
    void withdraw() {
        System.out.println("If you wanted withdraw when your balance minimum 100.");
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double a) {
        if(a>=100){
            System.out.println("Withdrw successfully.");
        }
        else {
            System.out.println("Withdrw not successful.");
        }
    }
}

public class Problem_05 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit();
        bankAccount.withdraw();

        SavingsAccount yourAccount = new SavingsAccount();
        double x = 122.23;
        yourAccount.withdraw(x);
    }
}
