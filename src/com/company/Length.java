package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Objects;

abstract class Length {

    protected double inches;
    protected double rawValue;

    public Length(double rawValue) throws ValueException {
        if (rawValue < 0)
            throw new ValueException("You done messed up brah");
        this.rawValue = rawValue;
        setInches();

    }

    abstract void setInches();

    public double getInches() {
        return inches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return Double.compare(length.inches, inches) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(inches);
    }
}
