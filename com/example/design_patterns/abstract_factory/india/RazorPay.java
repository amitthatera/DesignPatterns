package com.example.design_patterns.abstract_factory.india;

import com.example.design_patterns.abstract_factory.Payment;

public class RazorPay implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " with Razorpay.");
    }
}
