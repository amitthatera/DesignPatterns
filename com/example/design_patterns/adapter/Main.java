package com.example.design_patterns.adapter;

public class Main {

    public static void main(String[] args) {
        XMLtoJsonAdapter xmLtoJsonAdaptor = new XMLtoJsonAdapter(new XMLUserService());
        System.out.println("Json Data: " + xmLtoJsonAdaptor.getUserJson());
    }
}
