package com.example.design_patterns.strategy;

/*
  Definition:
  The Strategy Design Pattern is a behavioral pattern that lets you define a family of interchangeable algorithms or strategies and
  switch between them dynamically at runtime. Instead of hardcoding a specific behavior into a class, you encapsulate each behavior
  in a separate class and let the main object choose which one to use.
  Think of it like choosing a travel mode (car, bike, or walking) based on your needs—you pick the best strategy without changing
  your destination.

  For example,
  Imagine you’re shopping online and need to pay for your order. You can choose different payment methods: Credit Card, PayPal,
  or Cash on Delivery. Each method processes the payment differently, but they all achieve the same goal—completing the payment.
*/

public interface PaymentStrategy {

    void pay(double amount);
}
