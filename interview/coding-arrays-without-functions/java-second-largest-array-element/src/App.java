public class App {

    private static int getSecondLargestElement(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array can not be empty");
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i : array) {

            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
            
        }

        return secondLargest;

    }

    public static void main(String[] args) {
        
        int[] array = {1, 3, 2, 7, 6, 9};                   // Input

        int result = getSecondLargestElement(array);        // Process

        System.out.println("Result: " + result);            // Output: 7

    }

}
