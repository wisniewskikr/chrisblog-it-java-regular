package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue1() {
        
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int rotate = 3;

        int[] result = App.rightRotate(input, rotate);

        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, result);

    }

    @Test
    public void shouldAnswerWithTrue2() {
        
        int[] input = {1, 2, 3, 4, 5};
        int rotate = 2;

        int[] result = App.rightRotate(input, rotate);

        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, result);

    }

}
