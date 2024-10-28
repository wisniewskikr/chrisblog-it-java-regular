package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldAnswerWithArray1() {
        
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};          // Given 

        int[] result = App.largestSumArray(input);              // When

        assertArrayEquals(new int[]{4, -1, 2, 1}, result);       // Then

    }

    @Test
    public void shouldAnswerWithArray2() {
        
        int[] input = {1, 2, 3, 4, 5};                          // Given 

        int[] result = App.largestSumArray(input);              // When

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);     // Then

    }

    @Test
    public void shouldAnswerWithArray3() {
        
        int[] input = {-1, -2, -3, -4, -5};                     // Given 

        int[] result = App.largestSumArray(input);              // When

        assertArrayEquals(new int[]{-1}, result);               // Then

    }

    @Test
    public void shouldAnswerWithError() {
        
        int[] input = null;                                     // Given 
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input can not be null");

        App.largestSumArray(input);                             // When

    }

}
