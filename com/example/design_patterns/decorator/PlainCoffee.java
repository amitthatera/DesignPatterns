package com.example.design_patterns.decorator;

public class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "PlainCoffee";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
