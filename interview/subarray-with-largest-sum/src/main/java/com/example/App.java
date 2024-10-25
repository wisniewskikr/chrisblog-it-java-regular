package com.example;

public class App {

    public static void main( String[] args ) {

        // int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};          // Input
        // int[] input = {1, 2, 3, 4, 5};
        int[] input = {-1, -2, -3, -4, -5};

        int[] result = largestSumArray(input);                  // Calculation

        for (int i : result) {                                  // Output: 4, -1, 2, 1
            System.out.print(i + " ");
        }

    }

    public static int[] largestSumArray(int[] input) {
        
        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Input can not be null");
        
        int largestSum = 0;
        int currentSum = 0;
        int largestSumStartIndex = 0;
        int largestSumStopIndex = 0;
        int j;

        for (int i = 0; i < input.length; i++) {

            if (input[i] > largestSum) {
                largestSum = input[i];
                largestSumStartIndex = i;
                largestSumStopIndex = i;
            }
            
            j = i + 1;
            currentSum = input[i];

            while (j < input.length) {
                
                currentSum += input[j];

                if (currentSum > largestSum) {
                    largestSum = currentSum;
                    largestSumStartIndex = i;
                    largestSumStopIndex = j;                    
                }

                j++;

            }

        }

        System.out.println("Start index: " + largestSumStartIndex);
        System.out.println("Stop index: " + largestSumStopIndex);
        System.out.println("Largest sum: " + largestSum);

        int[] result = new int[largestSumStopIndex - largestSumStartIndex + 1];
        int r = 0;
        for (int i = largestSumStartIndex; i <= largestSumStopIndex; i++) {
            result[r] = input[i];
            r++;
        }

        return result;

    }

}
