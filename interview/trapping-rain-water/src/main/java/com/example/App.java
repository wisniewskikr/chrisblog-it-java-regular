package com.example;

public class App {

    public static void main( String[] args ) {

        int[] input = {1, 0, 1};                     // Input

        int result = trappedWaterCount(input);

        System.out.println("Trapping rain water count is: " + result);       

    }

    public static int trappedWaterCount(int[] input) {
        
        if (input == null || input.length == 0)
            throw new IllegalArgumentException("Input can not be null");

        int left = 0, right = input.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;
        
        while (left < right) {
            if (input[left] < input[right]) {
                if (input[left] >= leftMax) {
                    leftMax = input[left];
                } else {
                    trappedWater += leftMax - input[left];
                }
                left++;
            } else {
                if (input[right] >= rightMax) {
                    rightMax = input[right];
                } else {
                    trappedWater += rightMax - input[right];
                }
                right--;
            }
        }
        
        return trappedWater;

    }

}
