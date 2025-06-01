package com.example.design_patterns.factory;

public class Ship implements Logistic {

    @Override
    public void deliver() {
        System.out.println("Delivering the product by Ship.");
    }
}
