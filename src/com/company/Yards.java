package com.company;

public class Yards extends Length {

    public Yards(double rawValue) {
        super(rawValue);
    }

    @Override
    void setInches() {
        this.inches = this.rawValue * 3 * 12;
    }
}
