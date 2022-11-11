package org.mest.abs_tracts;

public class Tech extends Subject{

    public Tech(int hours) {
        super(hours);
    }

    @Override
    String name() {
        return "Technology";
    }

    @Override
    String teacher() {
        return "Lucky";
    }
}
