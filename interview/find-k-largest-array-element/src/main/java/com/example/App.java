package com.example;

public class App {

    public static void main( String[] args ) {
        
        int[] input = {3, 1, 5, 4, 9, 6};                            // Input
        int largest = 2;

        int result = findLargestElement(input, largest);

        if (result == -1) {
            System.out.println("Largest element not found");
        } else {
            System.out.println("Largest element is: " + result);     // Output: 6
        }
       

    }

    public static int findLargestElement(int[] input, int largest) {
        
        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Input can not be null");

        if (largest > input.length) 
            return-1;

        quickSort(input, 0, input.length - 1);

        return input[input.length - largest];

    }

    private static void quickSort(int[] input, int start, int end) {
        
        // Loop FOR, swapping, start, stop, pivot

        if (start > end)
            return;

        int pivot = partition(input, start, end);
        quickSort(input, start, pivot - 1);
        quickSort(input, pivot + 1, end);        

    }

    private static int partition(int[] input, int start, int end) {
        
        int i = start - 1;
        int pivot = input[end];

        for (int j = start; j < end; j++) {
            
            if (input[j] < pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp; 
            }

        }

        i++;
        int temp = input[i];
        input[i] = input[end];
        input[end] = temp; 

        return i;

    }

}
