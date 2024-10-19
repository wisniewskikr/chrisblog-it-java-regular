import java.util.Arrays;

public class App {

    private static void mergeSort(int[] array) {

        if (array.length < 2) {
            return; // Base case: array is already sorted
        }

        int mid = array.length / 2; // Find the midpoint
        int[] left = new int[mid]; // Create left sub-array
        int[] right = new int[array.length - mid]; // Create right sub-array

        // Fill left and right sub-arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        // Recursive calls to sort the sub-arrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted sub-arrays
        merge(array, left, right);

    }

    // Method to merge two sorted arrays
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right arrays into the main array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements of right array, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        
        int[] array = {13, 1, 5, 7, 4, 9, 12, 8};       // Input

        mergeSort(array);                               // Process

        System.out.println(Arrays.toString(array));     // Output [1, 4, 5, 7, 8, 9, 12, 13]

    }
}
