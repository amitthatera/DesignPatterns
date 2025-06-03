package com.example.design_patterns.strategy;

public class CashOnDelivery implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Cash on Delivery.");
    }
}
