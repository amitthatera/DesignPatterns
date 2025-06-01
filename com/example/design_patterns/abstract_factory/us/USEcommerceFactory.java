package com.example.design_patterns.abstract_factory.us;

import com.example.design_patterns.abstract_factory.EcommerceFactory;
import com.example.design_patterns.abstract_factory.Invoice;
import com.example.design_patterns.abstract_factory.Payment;

public class USEcommerceFactory implements EcommerceFactory {

    @Override
    public Payment createPayment() {
        return new Stripe();
    }

    @Override
    public Invoice createInvoice() {
        return new USInvoice();
    }
}
