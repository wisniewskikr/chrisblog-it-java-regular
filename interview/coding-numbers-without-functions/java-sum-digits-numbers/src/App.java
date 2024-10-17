public class App {

    private static int calculateDigitsSum(int number) {

        int result = 0;
        
        while (number != 0) {
            
            result += number % 10;
            number = number / 10;

        }
        
        return result;

    }

    public static void main(String[] args) {
        
        int number = 1234;                          // Input

        int result = calculateDigitsSum(number);    // Process

        System.out.println("Result: " + result);    // Output: 10

    }

}
