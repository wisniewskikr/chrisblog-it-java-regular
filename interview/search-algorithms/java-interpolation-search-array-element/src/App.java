public class App {

    private static int interpolationSearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1; // 4
 
        while(left <= right) { // 0 <= 4, 3 <= 4
            int probe = left + (right-left) * (target - array[left]) / (array[right] - array[left]);
            
            // Check if target is present at mid
            if(array[probe] == target) { // 4 == 10, 10 == 10
                return probe; // Target found at index mid
            }
 
            // If target is greater, ignore the left half
            if(array[probe] < target) { // 4 < 10
                left = probe + 1; // 3
            }
            else { // If target is smaller, ignore the right half
                right = probe - 1;
            }
        } 
        
        return-1; // Target not found in array

    }

    public static void main(String[] args) {
        
        int[] array = {1, 3, 7, 12, 18};                                // Input
        int target = 12;

        int result = interpolationSearch(array, target);                // Process

        if (result == -1) {                                             // Result: 3
            System.out.println("Element not found");
        } {
            System.out.println("Element found at index: " + result);
        }

    }

}
