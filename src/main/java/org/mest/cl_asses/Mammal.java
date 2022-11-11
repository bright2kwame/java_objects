package org.mest.cl_asses;

public class Mammal {

    private int numberOfLegs;

    public Mammal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    protected void closeEye() {
        System.out.println("Eyes Close");
    }

    public void walk(){

    }
}
