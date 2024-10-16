import java.util.Arrays;

public class App {

    private static int[] generateFibonacciArray(int number) {

        if (number == 0 || number < 0)
            throw new IllegalArgumentException("Number can not be 0 or less.");

        int[] result = new int[number + 1];
        int first = 0;
        int second = 1;

        result[0] = first;
        result[1] = second;

        for (int i = 2; i < result.length; i++) {
            result[i] = first + second;
            first = second;
            second = result[i];
        }

        return result;

    }

    public static void main(String[] args) {
        
        int number = 7;                                             // Input

        int[] result = generateFibonacciArray(number);              // Process

        System.out.println("Result: " + Arrays.toString(result));   // Output; 0, 1, 1, 2, 3, 5, 8, 13

    }

}
