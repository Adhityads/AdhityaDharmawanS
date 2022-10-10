package ujiandua;


public class Account {

    int acc_no;
    String name;
    double amount;

    public void insert(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public void deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        System.out.println(amount);
    }

    public void withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
            System.out.println(amount);
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
            System.out.println(amount);
        }
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}