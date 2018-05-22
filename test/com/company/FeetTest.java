package com.company;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FeetTest {

    private Feet testFeet;

    @Before
    public void setUp() {
        this.testFeet = new Feet(2);
    }

    @Test
    public void shouldConfirmTwoInchesEqual() {
        Inches inch1 = new Inches(24);
        assertEquals(inch1, testFeet);
    }

    @Test
    public void shouldConfirmTwoDifferentInchesNotEqual() {
        Inches inch1 = new Inches(5);
        assertNotEquals(inch1, testFeet);
    }


}
