package com.company;

import org.junit.Test;

import static com.company.Measurements.*;
import static org.junit.Assert.assertEquals;

public class MeasurementsTest {

    @Test
    public void shouldEqualSameInch(){
        Metrics metrics1 = new Metrics(1, FOOT);
        Metrics metrics2 = new Metrics(1, FOOT);
        assertEquals(metrics1, metrics2);

    }

    @Test
    public void shouldEqual12InchesTo1Foot(){
        Metrics metrics1 = new Metrics(12, INCH);
        Metrics metrics2 = new Metrics(1, FOOT);
        assertEquals(metrics1, metrics2);

    }
    @Test
    public void shouldEqual1yardTo3feet(){
        Metrics metrics1 = new Metrics(1, YARD);
        Metrics metrics2 = new Metrics(3, FOOT);
        assertEquals(metrics1, metrics2);

    } @Test
    public void shouldEqual1mileTo1760Yards(){
        Metrics metrics1 = new Metrics(1, MILE);
        Metrics metrics2 = new Metrics(1760, YARD);
        assertEquals(metrics1, metrics2);

    }



}
