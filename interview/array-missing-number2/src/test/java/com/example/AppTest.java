package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWith3() {

        int[] array = {1, 2, 4, 5, 6};                  // Given

        int result = App.missingNumber(array);          // When

        assertEquals(3, result);               // Then

    }
}
