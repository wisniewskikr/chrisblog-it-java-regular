package com.example;

public class App {

    public static void main( String[] args ) {
    
        int[] input = {1, 2, 3, 4};                 // Input

        int[] output = multipleExceptSelf(input);   // Calculation
        
        for (int i : output) {                      // Output: 24, 12, 8, 6
            System.out.print(i + " ");
        }

    }

    public static int[] multipleExceptSelf(int[] input) {

        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Input can not be null");

        int[] output = new int[input.length];
        int[] left = new int[input.length];
        int[] right = new int[input.length];
        int l = 0; 
        int r = input.length - 1;
    
        for (int i = 0; i < input.length; i++) {
            
            if (i == 0) {
                left[l] = 1;                
            } else {
                left[l] = input[i - 1] * left[l - 1]; 
            }

            l++;

        }

        for (int i = input.length - 1; i >= 0; i--) {
            
            if (i == input.length - 1) {
                right[r] = 1;                
            } else {
                right[r] = input[i + 1] * right[r + 1]; 
            }

            r--;

        }

        for (int i = 0; i < output.length; i++) {
            output[i] = left[i] * right[i];
        }
        
        return output;

    }

}
