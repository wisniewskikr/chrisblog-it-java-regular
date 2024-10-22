public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {3, 1, 6, 4, 7, 9};           // Input

        mergeSort(array);                           // Process

        for (int i : array) {                       // Output: 1, 3, 4, 6, 7, 9
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array) {

        if (array == null || array.length == 0)
            return;
        
        int length = array.length;        

        if (length <= 1)
            return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int i = 0, l = 0, r = 0;

        while (i < length) {
            
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
        
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l < leftLength && r < rightLength) {

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

        while (l < leftLength) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightLength) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}