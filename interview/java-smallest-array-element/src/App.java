public class App {

    public static int findSmallest(int[] array) {
        
        int result = array[0];

        for (int i : array) {
            result = (i < result) ? i : result;
        }

        return result;

    }

    public static void main(String[] args) throws Exception {
        
        int[] array = {2, 1, 3};                // Input

        int result = findSmallest(array);       // Process

        System.out.println(result);             // Output: 1

    }

}
