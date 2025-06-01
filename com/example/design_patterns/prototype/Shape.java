package com.example.design_patterns.prototype;

/*
  Definition:
  The Builder Pattern is a creational design pattern that is used to construct complex objects step by step.
  It separates the construction of a complex object from its representation, so the same construction process can create different
  representations.

  Imagine you’re building a drawing application (like Adobe Illustrator or Figma). Users create shapes like circles and rectangles and
  often want to duplicate them. Each shape has properties like color, size, and position.
  Recreating the same shape by setting all properties again would be time-consuming. Instead, we clone an existing shape,
  then change only the things we need

  cons:
  ->  Cloning complex objects that have circular references might be very tricky.
  ->  Deep Copy Challenges: In scenarios where objects contain complex nested structures or references to other objects,
      implementing a deep copy mechanism for cloning can be challenging.
 */

public interface Shape {

    Shape clone();

    void draw();
}
