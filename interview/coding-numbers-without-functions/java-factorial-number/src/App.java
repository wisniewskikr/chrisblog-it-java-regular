public class App {

    private static int calculateFactorial(int number) {

        int result = 1;

        if (number == 0)
            return result;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;

    }

    public static void main(String[] args) {
        
        int number = 5;                             // Input

        int result = calculateFactorial(number);    // Process

        System.out.println("Result: " + result);    // Output: 120

    }

}
