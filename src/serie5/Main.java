package serie5;

public class Main {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(231231, 2000);

        BitcoinPayment bp1 = new BitcoinPayment("asfbfkdxxx");
        PaypalPayment pp1 = new PaypalPayment("dylan.eray@gmail.com");
        CreditCardPayment ccp1 = new CreditCardPayment(223110, "Dylan", "03.04.2029");

        bp1.pay(20, ba1);
        pp1.pay(20,ba1);
        ccp1.pay(20,ba1);
    }
}
