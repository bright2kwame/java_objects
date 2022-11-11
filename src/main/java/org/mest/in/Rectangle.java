package org.mest.in;

import org.mest.abs.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double startPosition, double length, double width) {
        super(startPosition);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double findArea() {
        return this.length * this.width;
    }
}
