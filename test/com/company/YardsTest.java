package com.company;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardsTest {

    private Yards testYards;

    @Before
    public void setUp() {
        this.testYards = new Yards(2);
    }

    @Test
    public void shouldConfirmTwoInchesEqual() {
        Inches inch1 = new Inches(72.0);
        assertEquals(inch1, testYards);
    }

    @Test
    public void shouldConfirmTwoDifferentInchesNotEqual() {
        Inches inch1 = new Inches(5);
        assertNotEquals(inch1, testYards);
    }

}
