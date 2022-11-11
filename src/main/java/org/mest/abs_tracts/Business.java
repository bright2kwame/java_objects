package org.mest.abs_tracts;

public class Business extends Subject {

    public Business(int hours) {
        super(hours);
    }

    @Override
    String name() {
        return "Business";
    }

    @Override
    String teacher() {
        return "Lady O";
    }
}
