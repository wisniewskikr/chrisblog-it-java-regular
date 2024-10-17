public class App {

    private static int calculateGcd(int num1, int num2) {

        int start = (num1 < num2) ? num1 : num2;

        for (int i = start; i >= 1; i--) {
            
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        
        int num1 = 18;
        int num2 = 30;                             // Input

        int result = calculateGcd(num1, num2);     // Process

        System.out.println("Result: " + result);   // Output: 6

    }

}
