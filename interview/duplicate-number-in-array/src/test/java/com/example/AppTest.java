package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    @Rule
    public ExpectedException ee = ExpectedException.none();
    
    @Test
    public void shouldAnswerWith5(){
        
        int[] input = {2, 5, 3, 4, 8, 5, 9};                        // Given

        int result = App.findDuplicateNumber(input);                // When

        assertEquals(5, result);                            // Then

    }

    @Test
    public void shouldAnswerWithMinus1(){
        
        int[] input = {2, 5, 3, 4, 8, 6, 9};                        // Given

        int result = App.findDuplicateNumber(input);                // When

        assertEquals(-1, result);                                   // Then

    }

    @Test
    public void shouldAnswerWithException(){
        
        int[] input = null;                                        // Given
        ee.expect(IllegalArgumentException.class);
        ee.expectMessage("Input can not be null");

        App.findDuplicateNumber(input);                             // When

    }

}
