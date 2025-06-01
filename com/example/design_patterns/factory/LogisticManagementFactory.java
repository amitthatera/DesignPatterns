package com.example.design_patterns.factory;

/* Definition:
   Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses
   to alter the type of objects that will be created.

  Problem:
  Imagine that you’re creating a logistics management application. The first version of your app can only handle transportation
  by trucks, so the bulk of your code lives inside the Truck class.b After a while, your app becomes pretty popular.
  Each day you receive dozens of requests from sea transportation companies to incorporate sea logistics into the app.
  At present, most of your code is coupled to the Truck class. Adding Ships into the app would require making changes to the entire
  codebase. Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these
  changes again.

  pros:
  1. Single Responsibility Principle.
  2. Open/Closed Principle.

  cons:
  The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.
 */
public class LogisticManagementFactory {

    private LogisticManagementFactory() {
        super();
    }

    public static Logistic getLogistic(String type) {
        switch (type) {
            case "truck":
                return new Truck();

            case "ship":
                return new Ship();

            default:
                throw new IllegalArgumentException("Transportation type not supported");
        }
    }
}
