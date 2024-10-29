package com.example;

public class App {

    public static void main( String[] args ){

        int[] input = {2, 5, 3, 4, 8, 5, 9};                        // Input

        int result = findDuplicateNumber(input);                    // Calculation

        if (result == -1) {                                         // Output: 5
            System.out.println("Duplicate number not found");       
        } else {
            System.out.println("Duplicate number is: " + result);
        }

    }

    public static int findDuplicateNumber(int[] input) {

        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Input can not be null");

        bubbleSort(input);

        for (int i = 0; i < input.length; i++) {

            if (i == input.length - 1)
                break;
            
            if (input[i] == input[i + 1]) {
                return input[i];
            }

        }

        return-1;

    }

    private static void bubbleSort(int[] input) {
        
        for (int i = 0; i < input.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < input.length - 1 - i; j++) {

                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
                
            }

            if (!swapped)
                return;

        }

    }

}
