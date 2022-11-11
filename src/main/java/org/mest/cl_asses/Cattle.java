package org.mest.cl_asses;

public class Cattle extends Mammal {
   private int numberHead;

    public Cattle(int numberOfLegs, int numberHead) {
        super(numberOfLegs);
        this.numberHead = numberHead;
    }

    public void setNumberHead(int numberHead) {
        this.numberHead = numberHead;
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        int newLegs = 1 + numberOfLegs;
        super.setNumberOfLegs(newLegs);
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal(5);

        Cattle mainCattle = new Cattle(4, 1);
        mainCattle.closeEye();
        mainCattle.setNumberOfLegs(4);
        mainCattle.walk();
    }
}
