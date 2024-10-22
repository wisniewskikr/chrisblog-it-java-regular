

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {3, 1 ,5, 9, 8};                  // Input

        bubbleSort(array);                              // Process

        for (int i : array) {
            System.out.print(i + " ");                  // Output: 1, 3, 5, 8, 9
        }

    }

    private static void bubbleSort(int[] array) {

        if (array == null || array.length == 0)
            return;
        
        boolean swapped = false;
        
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }

            }

            if (!swapped) 
                return;

        }

    }

}