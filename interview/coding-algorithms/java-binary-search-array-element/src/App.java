public class App {

    private static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1; // 4
 
        while(left <= right) { // 0 <= 4, 3 <= 4
            int mid= left + (right-left) / 2; // 2, 3
            
            // Check if target is present at mid
            if(array[mid] == target) { // 4 == 10, 10 == 10
                return mid; // Target found at index mid
            }
 
            // If target is greater, ignore the left half
            if(array[mid] < target) { // 4 < 10
                left = mid + 1; // 3
            }
            else { // If target is smaller, ignore the right half
                right = mid - 1;
            }
        } 
        
        return-1; // Target not found in array

    }

    public static void main(String[] args) {
        
        int[] array = {1, 3, 7, 12, 18};                                // Input
        int target = 12;

        int result = binarySearch(array, target);          // Process

        if (result == -1) {                                             // Result: 3
            System.out.println("There is no element in the array.");
        } {
            System.out.println("Element exists with index: " + result);
        }

    }

}
