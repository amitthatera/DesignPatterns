package com.example.design_patterns.decorator;

public class ChocoChipsDecorator extends CoffeeDecorator{

    public ChocoChipsDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Choco Chips";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
