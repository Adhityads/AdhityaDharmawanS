package ujiandua.testng;


public class Account {

    public int acc_no;
    public String name;
    public double amount;

    public void insert(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public void deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }

    public void withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}