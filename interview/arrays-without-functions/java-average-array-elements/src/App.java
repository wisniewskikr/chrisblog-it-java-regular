public class App {

    public static double calculateAverage(int[] array) {

        int sum = 0;
        int count = 0;

        for (int i : array) {
            sum += i;
        }

        count = array.length;

        return (double) sum / count;

    }

    public static void main(String[] args) throws Exception {
        
        
        int[] array = {1, 2, 3};                // Input

        double result = calculateAverage(array);   // Body

        System.out.println(result);             // Output: 2

    }

}
