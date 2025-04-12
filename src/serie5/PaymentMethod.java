package serie5;


import java.math.BigDecimal;

interface PaymentMethod {
    void pay(BigDecimal amount, BankAccount destinationAccount);
}
