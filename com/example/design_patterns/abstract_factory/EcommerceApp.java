package com.example.design_patterns.abstract_factory;

public class EcommerceApp {

    private final Payment payment;

    private final Invoice invoice;

    public EcommerceApp(EcommerceFactory factory) {
        this.payment = factory.createPayment();
        this.invoice = factory.createInvoice();
    }

    public void checkout(double amount) {
        payment.processPayment(amount);
        invoice.generateInvoice(amount);
    }
}
