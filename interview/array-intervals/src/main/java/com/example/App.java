package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ){

        // int[][] input = {new int[]{3, 4}, new int[]{1, 2}};
        // int[][] input = {new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}};
        // int[][] input = {new int[]{1, 4}, new int[]{4, 5}};
        int[][] input = {new int[]{5, 7}, new int[]{1, 4}, new int[]{6, 8}};
        
        int[][] result = calculateIntervals(input);

        display(result);

    }

    private static int[][] calculateIntervals(int[][] input) {
        
        List<int[]> result = new ArrayList<>();
        int firstIndex = -1;
        int lastIndex = -1;

        sort(input);

        for (int i = 0; i < input.length; i++) {

            int[] first = input[i];
            
            if (i == input.length - 1) {
                lastIndex = first[first.length - 1];             
                break;
            }
            
            int[] second = input[i + 1];

            if (firstIndex == -1) {
                firstIndex = first[0];
            }

            if (first[first.length - 1] < second[0]) {                
                lastIndex = first[first.length - 1];
                int[] array = new int[]{firstIndex, lastIndex};
                result.add(array);
                firstIndex = second[0];
            } else {
                continue;
            }
            
        }
        
        int[] array = new int[]{firstIndex, lastIndex};
        result.add(array);

        return result.toArray(new int[0][0]);

    }

    private static void sort(int[][] input) {
        
        for (int i = 0; i < input.length; i++) {

            if (i == input.length - 1) 
                return;

            int[] first = input[i];
            int[] second = input[i + 1];

            if (first[0] > second[0]) {
                int[] temp = first;
                first = second;
                second = temp;
                input[i] = first;
                input[i + 1] = second;
            }
            
        }

    }

    private static void display(int[][] input) {
        
        for (int[] array : input) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.err.print(" | ");
        }

    }

}
