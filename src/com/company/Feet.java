package com.company;

public class Feet extends Length {
    public Feet(double rawValue) {
        super(rawValue);
    }

    @Override
    void setInches() {
        this.inches = this.rawValue * 12;
    }


}
