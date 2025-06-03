package com.example.design_patterns.observer;

public class NewsApp {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addSubscriber(new TVChannel("CNN"));
        newsAgency.addSubscriber(new NewsWebsite("BBC Online"));

        newsAgency.publishNews("Breaking News: Trump Imposed 90% Tariff on China");
    }
}
