package org.example;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double paymentAmount) {
        System.out.println("Оплата " + paymentAmount + " прошла");
    }
}
