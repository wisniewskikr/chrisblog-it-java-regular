

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {3, 1, 6, 4, 9, 7};               // Input

        mergeSort(array);                               // Process

        for (int i : array) {                           // Output: 1, 3, 4, 6, 7, 9
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array) {

        if (array == null || array.length == 0)
            return;

        int size = array.length;
        int i = 0, l = 0, r = 0;

        if (size <= 1)
            return;

        int mid = size / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[size - mid];

        while (i < size) {
            
            if (i < mid) {
                leftArray[l] = array[i];
                l++;
                i++;
            } else {
                rightArray[r] = array[i];
                r++;
                i++;
            }

        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
        
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int sizeLeft = leftArray.length;
        int sizeRight = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l < sizeLeft && r < sizeRight) {
            
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

        while (l < sizeLeft) {       
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < sizeRight) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
        
    }

}