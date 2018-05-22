package com.company;

public class Inches extends Length {

    public Inches(double rawValue) {
        super(rawValue);
    }

    @Override
    void setInches() {
        this.inches = this.rawValue;
    }
}
