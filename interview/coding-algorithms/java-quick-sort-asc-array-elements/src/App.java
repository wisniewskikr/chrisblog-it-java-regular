import java.util.Arrays;

public class App {

    // Method to perform Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] array, int low, int high) {
        // Pivot (Element to be placed at right position)
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    } 

    public static void main(String[] args) {

        int[] array = {1, 6, 3, 7, 9};                              // Input

        quickSort(array, 0, array.length - 1);                  // Process

        System.out.println("Result: " + Arrays.toString(array));    // Output: [1, 3, 6, 7, 9]
        
    }

}
