package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void shouldAnswerWith123() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};                // Given
        int target = 6;

        int[] result = App.givenSumSubarray(array, target);  // When

        assertEquals(1, result[0]);                 // Then
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);

    }

}
