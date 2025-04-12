package serie5;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentMethod{
    private String email ="";

    public PaypalPayment(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void pay(BigDecimal amount, BankAccount destinationAccount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && destinationAccount.getBalance().compareTo(amount) >= 0) {
            destinationAccount.remove(amount);
                System.out.println("Payment of " + amount + " made using Credit Card : " + " on Paypal : " + getEmail());
            }else {
            System.out.println("Error: Invalid amount or insufficient funds");
        }

    }
}
