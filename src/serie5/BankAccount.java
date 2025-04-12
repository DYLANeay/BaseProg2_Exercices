package serie5;

public class BankAccount {
    private int accountNumber=0;
    private double balance = 0;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void remove(double amount){
        this.balance-=amount;
    }

    public double getBalance() {
        return balance;
    }
}
