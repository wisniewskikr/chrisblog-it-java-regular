package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void shouldAnswerWith123() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};                // Given
        int target = 6;

        int[] result = App.givenSumSubarray(array, target);  // When

        assertEquals(1, result[0]);                 // Then
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAnswerWithExceptionForNullArray() {

        int[] array = null;                                  // Given
        int target = 6;

        App.givenSumSubarray(array, target);                 // When

    }

    @Test
    public void shouldAnswerWithExceptionForNoSum() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};                                    // Given
        int target = 100;
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("There is no given sum in the array");

        App.givenSumSubarray(array, target);                                    // When

    }

}
