package com.example;

public class App {

    public static void main( String[] args ) {

        int[] input = {1, 2, 3};                // Input
        int rotate = 4;

        int[] result = rightRotate(input, rotate);
        
        for (int i : result) {                   // Output: 3, 1, 2
            System.out.print(i + " ");
        }
        
    }

    private static int[] rightRotate(int[] input, int rotate) {

        if (rotate == input.length)
            return input;

        if (rotate > input.length)
            rotate = rotate % input.length;
        
        int[] result = new int[input.length];
        int size = input.length - 1; 
        int mid = size - rotate;     
        int index = 0;

        for (int i = size; i > mid; i--) {
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
