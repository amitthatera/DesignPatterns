package com.example.design_patterns.decorator;

public class IceCreamDecorator extends CoffeeDecorator {

    public IceCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with IceCream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }
}
