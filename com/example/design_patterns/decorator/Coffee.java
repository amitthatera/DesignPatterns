package com.example.design_patterns.decorator;

/*
  Definition:
  The Decorator Design Pattern is a structural pattern that allows you to add new functionality to an object without modifying its code.
  It does this by wrapping the original object in a series of "decorator" objects that add behaviors or responsibilities dynamically.
  It promotes flexibility and reusability and adheres to the Open/Closed Principle — open for extension but closed for modification.
  Think of it like adding toppings to a pizza—you start with a basic pizza and add layers (like extra cheese or pepperoni) without
  changing the pizza itself.
*/

public interface Coffee {

    String getDescription();

    double getCost();
}
