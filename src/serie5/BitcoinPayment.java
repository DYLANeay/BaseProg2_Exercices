package serie5;

import java.math.BigDecimal;

public class BitcoinPayment implements PaymentMethod {
    private String walletAdress ="";
    public BitcoinPayment(String walletAdress){

        this.walletAdress=walletAdress;
    }


    @Override
    public void pay(BigDecimal amount, BankAccount destinationAccount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && destinationAccount.getBalance().compareTo(amount) >= 0) {
            destinationAccount.remove(amount);
            System.out.println("Payment of " + amount + " made using Bitcoin having wallet address : " + getWalletAdress() + " on BankAcc");
        }else {
            System.out.println("Error: Invalid amount or insufficient funds");
        }
    }

    public String getWalletAdress() {
        return walletAdress;
    }
}

