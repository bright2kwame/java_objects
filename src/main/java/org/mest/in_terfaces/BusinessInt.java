package org.mest.in_terfaces;

public class BusinessInt implements SubjectInt{
    @Override
    public String name() {
        return "Business";
    }

    @Override
    public String teacher() {
        return "Lady O";
    }

    @Override
    public void represent() {
        System.out.println("Interface: " + name() + ": has " + teacher() + " as teacher");
    }

    @Override
    public int hours() {
        return 10;
    }
}
