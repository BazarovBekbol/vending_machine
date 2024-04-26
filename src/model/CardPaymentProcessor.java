package model;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean acceptPayment(int amount) {
        System.out.println("Введите номер карты и одноразовый пароль для проведения транзакции на сумму " + amount);
        return true;
    }

    @Override
    public void displayPaymentOptions() {
        System.out.println("Пополнить баланс через карту. Введите сумму:");
    }
}
