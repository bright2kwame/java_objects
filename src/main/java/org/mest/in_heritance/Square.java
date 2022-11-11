package org.mest.in_heritance;

import org.mest.abs_tracts.Shape;

public class Square extends Shape {

    private double side;


    public Square(double startPosition, double side) {
        super(startPosition);
        this.side = side;
    }


    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double findArea() {
        return this.side * this.side;
    }
}
