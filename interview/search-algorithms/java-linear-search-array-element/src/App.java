public class App {

    private static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return-1;

    }

    public static void main(String[] args) {
        
        int[] array = {1, 3, 7, 12, 18};                    // Input
        int target = 12;

        int result = linearSearch(array, target);           // Process

        System.out.println("Result: " + result);            // Output: 3

    }

}
