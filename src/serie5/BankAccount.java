package serie5;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;
    public ArrayList<PaymentMethod> listOfPaymentMethod;

    private static BigDecimal interestRate = BigDecimal.valueOf(0.1); //Attention en java si on met un calcul il arrondi au int supérieur

    public BankAccount(int accountNumber, BigDecimal balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.listOfPaymentMethod= new ArrayList<PaymentMethod>();
    }

    public void deposit(BigDecimal amount){
        this.balance=this.balance.add(amount);
    }

    public void remove(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    public void addInterest() {
        this.balance = this.balance.multiply(interestRate.add(BigDecimal.ONE));
    }

    public void addPaymentMethod(PaymentMethod pm1){
        listOfPaymentMethod.add(pm1);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public ArrayList<PaymentMethod> getListOfPaymentMethod() {
        return listOfPaymentMethod;
    }
}
