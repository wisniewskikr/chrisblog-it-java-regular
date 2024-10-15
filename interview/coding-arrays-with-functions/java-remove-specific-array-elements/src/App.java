import java.util.Arrays;

public class App {

    private static int[] removeElementsFromArray(int[] array, int elementToRemove) {

        if (array == null || array.length == 0)
            return new int[0];

        int count = 0;
        int index = 0;
        int[] newArray = null;

        for (int i : array) {            
            if (i == elementToRemove)
                count++;
        }

        newArray = new int[array.length - count];
        
        for (int i : array) {            
            if (i != elementToRemove)
                newArray[index++] = i;                            
        }

        return newArray;

    }

    public static void main(String[] args) {
        
        int[] array = {1, 2, 5, 3, 7, 3, 6};                            // Input
        int elementToRemove = 3;

        int[] result = removeElementsFromArray(array, elementToRemove); // Process

        System.out.println("Result: " + Arrays.toString(result));       // Output: [1, 2, 5, 7, 6]

    }

}
