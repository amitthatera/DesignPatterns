package com.example.design_patterns.observer;

/*
  Definition:
  The Observer Design Pattern is a behavioral pattern that defines a one-to-many dependency between objects so that when one
  object (the subject) changes state, all its dependent objects (observers) are notified and updated automatically.

  Imagine a news agency that publishes breaking news. Subscribers (like TV channels, websites, or apps) want to be notified
  whenever new news is published.
*/

public interface NewsSubscriber {

    void update(String latestNews);
}
