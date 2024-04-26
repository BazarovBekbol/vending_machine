package model;

public interface PaymentProcessor {
    boolean acceptPayment(int amount);
    void displayPaymentOptions();
}
