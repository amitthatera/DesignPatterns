package com.example.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency{

    private List<NewsSubscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void addSubscriber(NewsSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(NewsSubscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        for(NewsSubscriber subscriber : subscribers){
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}
