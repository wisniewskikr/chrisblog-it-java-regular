public class App {

    public static void main(String[] args) {
    
        int[] array1 = {3, 1, 0, 4, 2};                                     // Input
        int[] array2 = {7, 6, 9, 8, 5};
        int target = 7;

        int[] array = merge(array1, array2);                                // Process
        quickSort(array, 0, array.length - 1);
        int index = binarySearch(array, target);

        if (index == 1) {                                                   // Output: 7
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at the index: " + index);
        }
    
    }

    private static int binarySearch(int[] array, int target) {
        
        // while, left, right, mid

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            
            int mid = left + (right - left) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (target > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return-1;

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

        for (int j = start; j <= end - 1; j++) {
            
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

    private static int[] merge(int[] array1, int[] array2) {

        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0)
            return new int[0]; 
        
        int size = array1.length + array2.length;
        int[] array = new int[size];
        int i = 0, l = 0, r = 0;

        while (i < size) {

            if (i < array1.length) {
                array[i] = array1[l];
                i++;
                l++;
            } else {
                array[i] = array2[r];
                i++;
                r++;
            }
            
        }

        return array;

    }

}
