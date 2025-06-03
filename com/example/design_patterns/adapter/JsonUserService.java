package com.example.design_patterns.adapter;

/*
  Definition:
  The Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to work together by
  wrapping an existing class with a new interface. It’s like a translator that makes one class’s interface compatible with another.

  For example, You have, a European socket (provides electricity in a European standard). A Mobile charger that only fits into an
  Indian socket. You need an Adapter that allows your Indian charger to work with a European socket.

  Another example, You are building an app that expect json data from an API, but third party gives xml. To resolve that issue create
  an adapter that convert xml to json.

  Pros:
  -> Promotes code reusability of existing classes.
  -> Supports interoperability between incompatible interfaces.
  -> Decouples client from legacy implementations.

  Cons:
  -> Adds extra code (boilerplate).
  -> May become complex with too many adapters.
  -> Can hide bad design if overused.
 */

public interface JsonUserService {

    String getUserJson();
}
