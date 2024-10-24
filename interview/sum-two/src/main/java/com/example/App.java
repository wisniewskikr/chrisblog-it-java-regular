package com.example;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args ) {
        
        int[] array = {2, 4, 7, 6, 8};
        int target = 12;                                                                                                // Input

        int[] result = calculateSumTwo(array, target);                                                                  // Calculation

        System.out.println("Index of first number is " + result[0] + " and index of second number is " + result[1]);    // Output: 1, 4

    }

    public static int[] calculateSumTwo(int[] array, int target) {
        
        if (array == null)
            throw new IllegalArgumentException("Array can not be null");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            
            int complement = target - array[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(array[i], i);

        }

        throw new IllegalArgumentException("No two sum solution");

    }
}
