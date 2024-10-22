

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {3, 1, 6, 4, 7};                  // Input

        quickSort(array, 0, array.length - 1);    // Process

        for (int i = 0; i < array.length; i++) {        // Output: 1, 3, 4, 6, 7
            System.out.print(array[i] + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {
        
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int i = start - 1;
        int tmp;

        for (int j = start; j <= end - 1; j++) {
            
            if (array[j] < pivot) {
                i++;
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

        }
        i++;
        tmp = array[i];
        array[i] = array[end];
        array[end] = tmp;

        return i;

    }

}