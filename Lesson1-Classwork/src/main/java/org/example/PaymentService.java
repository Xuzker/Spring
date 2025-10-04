package org.example;

public class PaymentService {
    private PaymentProcessor paymentProcessor;
    public PaymentService (PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void pay(double money) {
        paymentProcessor.processPayment(money);
    }
}
