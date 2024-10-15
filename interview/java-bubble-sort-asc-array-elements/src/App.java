import java.util.Arrays;

public class App {

    private static void bubbleSortAsc(int[] array) {

        if (array == null || array.length == 0) 
            return;

        int end = array.length;
        int tmp;
        boolean swapped;

        for (int i = 0; i < end; i++) {
            swapped = false;

            for (int j = 0; j < end - 1; j++) {
                
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }

            }

            if (!swapped)
                break;
            
        }

    } 

    public static void main(String[] args) {

        int[] array = {1, 6, 3, 7, 9};                          // Input

        bubbleSortAsc(array);                                   // Process

        System.out.println("Result: " + Arrays.toString(array)); // Output: [1, 3, 6, 7, 9]
        
    }

}
