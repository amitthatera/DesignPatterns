package com.example.design_patterns.factory;

public class Truck implements Logistic{

    @Override
    public void deliver() {
        System.out.println("Delivering the product by Truck.");
    }
}
