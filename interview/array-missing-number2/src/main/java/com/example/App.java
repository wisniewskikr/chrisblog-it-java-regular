package com.example;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ) {
        
        int[] array = {1, 2, 4, 5, 6};                          // Input

        int number = missingNumber(array);                      // Calculation

        System.out.println("Missing number is: " + number);     // Output: 3

    }

    public static int missingNumber(int[] array) {

        if (array == null || array.length == 0)
            new IllegalArgumentException("Array can not be null");

        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1)
                break;
            
            if (array[i + 1] - array[i] != 1)
                return array[i] + 1;

        }

        throw new IllegalArgumentException("There is no missing number in the array.");

    }

}
