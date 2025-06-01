package com.example.design_patterns.factory;

public class Main {

    public static void main(String[] args) {
        Logistic truck = LogisticManagementFactory.getLogistic("truck");
        truck.deliver();

        Logistic ship = LogisticManagementFactory.getLogistic("ship");
        ship.deliver();

//        Logistic logistic = LogisticManagementFactory.getLogistic("car");
    }
}
