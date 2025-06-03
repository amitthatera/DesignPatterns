package com.example.design_patterns.strategy;


public class Paypal implements PaymentStrategy {

    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Paypal: " + email);
    }
}
