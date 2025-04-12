package serie5;

public class BitcoinPayment implements PaymentMethod {
    private String walletAdress ="";
    public BitcoinPayment(String walletAdress){

        this.walletAdress=walletAdress;
    }


    @Override
    public void pay(double amount, BankAccount destinationAccount) {
        if (amount>0 && destinationAccount.getBalance()>amount){
            destinationAccount.remove(amount);
            System.out.println("Payment of " + amount + " made using Bitcoin having wallet address : " + getWalletAdress() + " on BankAcc");
        }else if (amount<0 && destinationAccount.getBalance()<amount){
            System.out.println("Error, not enough money m8");
        }
    }

    public String getWalletAdress() {
        return walletAdress;
    }
}

