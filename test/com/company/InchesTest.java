package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InchesTest {


    @Test
    public void shouldConfirmTwoInchesEqual() {
        Inches inch1 = new Inches(5);
        Inches inch2 = new Inches(5);
        assertEquals(inch1, inch2);
    }

    @Test
    public void shouldConfirmTwoDifferentInchesNotEqual() {
        Inches inch1 = new Inches(5);
        Inches inch2 = new Inches(8);
        assertNotEquals(inch1, inch2);
    }

    @Test(expected = Exception.class)
    public void shouldThrowInvalidInputException() {
        new Inches(-5);
    }
}
