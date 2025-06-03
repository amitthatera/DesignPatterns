package com.example.design_patterns.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentStrategy(new CreditCard("xxxx-xxxx-xxxx-4523"));
        processor.processPayment(4000);

        processor.setPaymentStrategy(new Paypal("amitthatera@gmail.com"));
        processor.processPayment(1500);

        processor.setPaymentStrategy(new CashOnDelivery());
        processor.processPayment(2300);
    }
}
