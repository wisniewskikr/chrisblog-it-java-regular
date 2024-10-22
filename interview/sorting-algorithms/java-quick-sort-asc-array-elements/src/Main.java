

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {3, 1, 6, 4, 7, 9};               // Input

        quickSort(array, 0, array.length - 1);    // Process

        for (int i : array) {                           // Output: 1, 3, 4, 6, 7, 9
            System.out.print(i + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {

        if (array == null || array.length == 0)
            return;

        if (end <= start) 
            return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
        
    }

    private static int partition(int[] array, int start, int end) {

        int i = start - 1;
        int pivot = array[end];

        for (int j = 0; j < end - 1; j++) {
            
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }

}