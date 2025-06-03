package com.example.design_patterns.observer;

public class TVChannel implements NewsSubscriber{

    private String name;

    public TVChannel(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " broadcasting news: " + news);
    }
}
