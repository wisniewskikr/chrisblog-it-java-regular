package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    @Rule
    public ExpectedException ee = ExpectedException.none();
    
    @Test
    public void shouldAnswerWithException() {
        
        int[] input = null;                     // Given
        ee.expect(IllegalArgumentException.class);
        ee.expectMessage("Input can not be null");

        App.multipleExceptSelf(input);          // When

    }

    @Test
    public void shouldAnswerWithPass1() {
        
        int[] input = {1, 2, 3, 4};                             // Given
        int[] expected = {24, 12, 8, 6};

        int[] output = App.multipleExceptSelf(input);           // When

        assertArrayEquals(expected, output);                    // Then

    }

    @Test
    public void shouldAnswerWithPass2() {
        
        int[] input = {10, 1, 2};                               // Given
        int[] expected = {2, 20, 10};

        int[] output = App.multipleExceptSelf(input);           // When

        assertArrayEquals(expected, output);                    // Then

    }

}
