package com.example.design_patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(2, "red");
        Circle circleCopy = (Circle) circle.clone();
        circleCopy.setColor("orange");
        circleCopy.setRadius(5);

        Shape rectangle = new Rectangle(5, 4, "blue");
        Rectangle rectangleCopy = (Rectangle) rectangle.clone();
        rectangleCopy.setColor("black");
        rectangleCopy.setWidth(10);
        rectangleCopy.setHeight(15);

        System.out.println("Originals:");
        circle.draw();
        rectangle.draw();

        System.out.println("\nCopy:");
        circleCopy.draw();
        rectangleCopy.draw();
    }
}
