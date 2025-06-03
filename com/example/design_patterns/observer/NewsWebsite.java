package com.example.design_patterns.observer;

public class NewsWebsite implements NewsSubscriber{

    private String name;

    public NewsWebsite(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " posting news online: " + news);
    }
}
