package com.example.design_patterns.abstract_factory.india;

import com.example.design_patterns.abstract_factory.EcommerceFactory;
import com.example.design_patterns.abstract_factory.Invoice;
import com.example.design_patterns.abstract_factory.Payment;

public class IndianEcommerceFactory implements EcommerceFactory {

    @Override
    public Payment createPayment() {
        return new RazorPay();
    }

    @Override
    public Invoice createInvoice() {
        return new IndianInvoice();
    }
}
