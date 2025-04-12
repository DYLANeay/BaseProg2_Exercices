package serie5;

import java.util.Date;

public class CreditCardPayment implements PaymentMethod{
    private int cardNumber = 0;
    private String cardHolder ="";
    private String expiryDate;

    public CreditCardPayment(int cardNumber, String cardHolder, String expiryDate){
       this.cardNumber= cardNumber;
        this.cardHolder=cardHolder;
        this.expiryDate=expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    @Override
    public void pay(double amount, BankAccount destinationAccount) {
        if (amount>0 && destinationAccount.getBalance()>amount) {
            destinationAccount.remove(amount);
            System.out.println("Payment of " + amount + " made using Credit Card : " + getCardNumber() + ", " + getCardHolder() + ", " + getExpiryDate() + " on BankAcc");

        }else if (amount<0 && destinationAccount.getBalance()<amount){
        System.out.println("Error, not enough money m8");
    }
    }
}
