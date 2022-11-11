package org.mest.abs;

abstract public class Shape {

    private double startPosition;

    public Shape(double startPosition){
      this.startPosition = startPosition;
    }

    public abstract double calculateVolume();

    public abstract double findArea();

    void move(double nextLocation) {
        System.out.println("Moved from " + startPosition + " to " + nextLocation);
    }
}
