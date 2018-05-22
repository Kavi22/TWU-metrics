package com.company;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MilesTest {

    private Miles testMiles;

    @Before
    public void setUp() {
        this.testMiles = new Miles(5);
    }

    @Test
    public void shouldReturnCorrectNumberOfInches() {
        assertEquals(316800.0, testMiles.getInches());
    }

    @Test
    public void shouldConfirmTwoInchesEqual() {
        Inches inch1 = new Inches(316800.0);
        assertEquals(inch1, testMiles);
    }

    @Test
    public void shouldConfirmTwoDifferentInchesNotEqual() {
        Inches inch1 = new Inches(5);
        assertNotEquals(inch1, testMiles);
    }

}
