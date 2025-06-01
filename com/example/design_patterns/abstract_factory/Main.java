package com.example.design_patterns.abstract_factory;

import com.example.design_patterns.abstract_factory.india.IndianEcommerceFactory;
import com.example.design_patterns.abstract_factory.us.USEcommerceFactory;

public class Main {

    public static void main(String[] args) {
//        EcommerceFactory factory = new IndianEcommerceFactory();
//        EcommerceApp app = new EcommerceApp(factory);
//        app.checkout(2000);

        EcommerceApp app = new EcommerceApp(new USEcommerceFactory());
        app.checkout(2000);
    }
}
