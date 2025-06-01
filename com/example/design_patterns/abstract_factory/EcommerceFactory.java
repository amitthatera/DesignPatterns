package com.example.design_patterns.abstract_factory;


/*
   Definition:
   Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete
   classes.

   Problem:
   Imagine you’re building an e-commerce platform that will be launched in multiple countries (e.g., USA, India, UK). Each country has:
   -> Its own payment system (e.g., Stripe, Razorpay, PayPal).
   -> Its own invoice format (e.g., in USD, INR, GBP).
   -> Its own tax rules.
   As more countries get added, your code turns into a jungle of if-else or switch statements everywhere.
 */

public interface EcommerceFactory {

    Payment createPayment();
    Invoice createInvoice();
}
