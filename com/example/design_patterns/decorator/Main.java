package com.example.design_patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());

        coffee = new IceCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());

        coffee = new ChocoChipsDecorator(coffee);
        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
    }
}
