package serie5;

import java.math.BigDecimal;
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
    public void pay(BigDecimal amount, BankAccount destinationAccount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && destinationAccount.getBalance().compareTo(amount) >= 0) {
            destinationAccount.remove(amount);
            System.out.println("Payment of " + amount + " made using Credit Card : " + getCardNumber() + ", " + getCardHolder() + ", " + getExpiryDate() + " on BankAcc");
        } else {
            System.out.println("Error: Invalid amount or insufficient funds");
        }
    }

}
