package serie5;

import java.util.ArrayList;

public class BankAccount {
    private int accountNumber=0;
    private double balance = 0;
    public static ArrayList<PaymentMethod> listOfPaymentMethod = new ArrayList<PaymentMethod>();

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

    public void addPaymentMethod(PaymentMethod pm1){
        listOfPaymentMethod.add(pm1);
    }

    public double getBalance() {
        return balance;
    }

    public static ArrayList<PaymentMethod> getListOfPaymentMethod() {
        return listOfPaymentMethod;
    }
}
