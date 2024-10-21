import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {4, 2, 5, 9, 8, 3};                           // Input

        mergeSort(array);                                           // Process

        System.out.println("Result: " + Arrays.toString(array));    // Output: [2, 3, 4, 5, 8, 9]

    }

    private static void mergeSort(int[] array) {
        
        int length = array.length;

        if (length <= 1)
            return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int l = 0;
        int r = 0;

        for (int index = 0; index < length; index++) {
            
            if (index < mid) {
                leftArray[l] = array[index];
                l++;
            } else {
                rightArray[r] = array[index];
                r++;
            }

        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {

            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
            
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}