package serie5;

public class PaypalPayment implements PaymentMethod{
    private String email ="";

    public PaypalPayment(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void pay(double amount, BankAccount destinationAccount) {
            if (amount>0 && destinationAccount.getBalance()>amount) {
                destinationAccount.remove(amount);
                System.out.println("Payment of " + amount + " made using Credit Card : " + " on Paypal : " + getEmail());
            }else if (amount<0 && destinationAccount.getBalance()<amount) {
                System.out.println("Error, not enough money m8");
            }

    }
}
