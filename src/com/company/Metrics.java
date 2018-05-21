package com.company;

import java.util.Objects;

public class Metrics {
    private int num;
    private Measurements aMeasurements;

    Metrics(int num, Measurements aMeasurements) {

        this.num = num;
        this.aMeasurements = aMeasurements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metrics metrics = (Metrics) o;
       int metricsLength =  metrics.aMeasurements.getBaseUnits() * metrics.num;
       int thisLength = this.aMeasurements.getBaseUnits() * this.num;
       return metricsLength == thisLength;
    }

    @Override
    public int hashCode() {

        return Objects.hash(num, aMeasurements);
    }
}
