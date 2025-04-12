package serie5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(231231, BigDecimal.valueOf(2000));

        BitcoinPayment bp1 = new BitcoinPayment("asfbfkdxxx");
        PaypalPayment pp1 = new PaypalPayment("dylan.eray@gmail.com");
        CreditCardPayment ccp1 = new CreditCardPayment(223110, "Dylan", "03.04.2029");

//        bp1.pay(20, ba1);
//        pp1.pay(20,ba1);
//        ccp1.pay(20,ba1);

        ba1.addPaymentMethod(bp1);
        ba1.addPaymentMethod(pp1);
        ba1.addPaymentMethod(ccp1);

        for (PaymentMethod pm : ba1.getListOfPaymentMethod()){
            pm.pay(BigDecimal.valueOf(19), ba1);
        }

        System.out.println(ba1.getBalance());

        ba1.addInterest();

        System.out.println(ba1.getBalance());
    }
}
