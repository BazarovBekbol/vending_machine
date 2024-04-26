package model;

public class CoinPaymentProcessor implements PaymentProcessor {
    private CoinAcceptor coinAcceptor;

    public CoinPaymentProcessor(CoinAcceptor coinAcceptor) {
        this.coinAcceptor = coinAcceptor;
    }

    @Override
    public boolean acceptPayment(int amount) {
        coinAcceptor.setAmount(coinAcceptor.getAmount() + amount);
        return true;
    }

    @Override
    public void displayPaymentOptions() {
        System.out.println("Пополнить баланс монетами. Введите сумму:");
    }
}
