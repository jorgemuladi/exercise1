package org.example;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calDiameter() {
        return 2 * radius;
    }

    public double calCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calArea() {
        return Math.PI * radius * radius;
    }



}
