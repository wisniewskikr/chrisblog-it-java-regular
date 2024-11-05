package com.example;

public class App {

    public static void main( String[] args ) {

        int[] input = {1, 2, 3};                        // Input
        int rotate = 2;

        int[] result = rightRotate(input, rotate);      // Calculation
        
        for (int i : result) {                          // Output: 2, 3, 1
            System.out.print(i + " ");
        }
        
    }

    public static int[] rightRotate(int[] input, int rotate) {

        if (rotate == input.length)
            return input;

        if (rotate > input.length)
            rotate = rotate % input.length;
        
        int[] result = new int[input.length];
        int size = input.length - 1; // 6
        int mid = size - rotate;     // 3
        int index = 0;

        for (int i = mid + 1; i <= size; i++) {
            result[index] = input[i];
            index++; 
        }

        for (int i = 0; i <= mid; i++) {
            result[index] = input[i];
            index++;
        }

        return result;

    }

}
