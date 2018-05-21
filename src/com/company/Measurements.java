package com.company;

public enum Measurements {
    INCH(1),
    FOOT(12),
    YARD(36),
    MILE(63360);

    private int baseUnits;

    Measurements(int baseUnits) {

        this.baseUnits = baseUnits;
    }


    public int getBaseUnits() {
        return baseUnits;
    }
}

// 1 yard = 3 feet
// 1 miles = 1760 yards