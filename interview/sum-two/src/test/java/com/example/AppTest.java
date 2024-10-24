package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void shouldAnswerWith1And4() {

        int[] array = {2, 4, 7, 6, 8};                              // Given
        int target = 12; 

        int[] result = App.calculateSumTwo(array, target);           // When

        assertEquals(1, result[0]);                         // Then
        assertEquals(4, result[1]);

    }
}
