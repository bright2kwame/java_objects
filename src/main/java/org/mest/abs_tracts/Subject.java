package org.mest.abs_tracts;

abstract public class Subject {

    public int hours;

    Subject(int hours) {
        this.hours = hours;
    }

    abstract String name();

    abstract String teacher();

    public void represent() {
        System.out.println(name() + ": has " + teacher() + " as teacher");
    }

}
