package pl.training.module02;

public class Account {

    String number = "";
    double balance; //domyślnie 0.0
    boolean isActive;   //false domyślnie

/*    public Account() {
        isActive = true;
        System.out.println("Ne account was created");
    }*/

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
}
