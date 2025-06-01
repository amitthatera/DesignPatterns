package com.example.design_patterns.abstract_factory.us;

import com.example.design_patterns.abstract_factory.Invoice;

public class USInvoice implements Invoice {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating US invoice for $" + amount);
    }
}
