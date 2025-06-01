package com.example.design_patterns.abstract_factory.india;

import com.example.design_patterns.abstract_factory.Invoice;

public class IndianInvoice implements Invoice {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating India invoice for ₹" + amount);
    }
}
