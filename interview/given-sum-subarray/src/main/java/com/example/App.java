package com.example;

public class App {

    public static void main( String[] args ) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};                // Input
        int target = 6;

        int[] result = givenSumSubarray(array, target);     // Calculation

        System.out.print("Result: ");
        for (int i : result) {                              // Output: 1, 2, 3
            System.out.print(i + " ");
        }

    }

    public static int[] givenSumSubarray(int[] array, int target) {

        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array can not be empty");

        int sum = 0;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            
            sum += array[i];

            if (sum == target) {
                index = i;
                break;
            }

        }

        if (index == -1)
            throw new IllegalArgumentException("There is no given sum in the array");

        int[] result = new int[index + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;

    }

}
