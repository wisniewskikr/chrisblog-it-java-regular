package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntervalMerger {
    
    public int[][] merge(int[][] intervals) {
        // Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        for (int[] interval : intervals) {
            // If merged is empty or there is no overlap, add the interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // There is overlap, merge the intervals by updating the end time
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        IntervalMerger merger = new IntervalMerger();
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        
        int[][] result = merger.merge(intervals);
        
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
