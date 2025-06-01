package com.example.design_patterns.prototype;

public class Rectangle implements Shape {

    private double width;

    private double height;

    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle of " + width + " x " + height);
    }
}
