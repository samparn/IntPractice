package practice.designpatterns.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void makePayment(int amt) {
        paymentStrategy.pay(amt);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
