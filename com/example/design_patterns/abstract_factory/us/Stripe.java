package com.example.design_patterns.abstract_factory.us;

import com.example.design_patterns.abstract_factory.Payment;

public class Stripe implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " with Stripe.");
    }
}
