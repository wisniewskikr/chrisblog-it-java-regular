package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    @Rule
    public ExpectedException ee = ExpectedException.none();
    
    @Test
    public void shouldAnswerWith6() {

        int[] input = {3, 1, 5, 4, 9, 6};                            // Given
        int largest = 2;

        int result = App.findLargestElement(input, largest);          // When 

        assertEquals(6, result);                             // Then

    }

    @Test
    public void shouldAnswerWithMinus1() {

        int[] input = {3, 1, 5, 4, 9, 6};                            // Given
        int largest = 7;

        int result = App.findLargestElement(input, largest);         // When 

        assertEquals(-1, result);                                    // Then

    }

    @Test
    public void shouldAnswerWithException() {

        int[] input = null;                            // Given
        int largest = 7;
        ee.expect(IllegalArgumentException.class);
        ee.expectMessage("Input can not be null");

        App.findLargestElement(input, largest);         // When 

    }

}
