package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldReturn6() {

        String[] input = {"2", "4", "+"};       // Given

        int result = App.calculateRPN(input);   // When

        assertEquals(6, result);                // Then

    }

    @Test
    public void shouldReturn16() {

        String[] input = {"2", "4", "*", "8", "+"};         // Given

        int result = App.calculateRPN(input);               // When

        assertEquals(16, result);                            // Then

    }

    @Test
    public void shouldReturn24() {

        String[] input = {"2", "4", "8", "+", "*"};         // Given

        int result = App.calculateRPN(input);               // When

        assertEquals(24, result);                            // Then

    }

    @Test
    public void shouldReturn12() {

        String[] input = {"2", "4", "8", "+", "*", "2", "/"};   // Given

        int result = App.calculateRPN(input);                   // When

        assertEquals(12, result);                               // Then

    }

    @Test
    public void shouldReturnMinus8() {

        String[] input = {"2", "4", "8", "-", "*"};             // Given

        int result = App.calculateRPN(input);                   // When

        assertEquals(-8, result);                               // Then

    }

}
