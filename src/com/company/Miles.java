package com.company;

public class Miles extends Length {

    public Miles(double rawValue) {
        super(rawValue);
    }

    @Override
    void setInches() {
        this.inches = this.rawValue * 1760 * 3 * 12;
    }

}
