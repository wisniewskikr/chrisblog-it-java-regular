public class App {

    public static int sumArrayElements(int[] array) {
        
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;

    }

    public static void main(String[] args) throws Exception {

        int[] array = {1, 2, 3};                // Input

        int result = sumArrayElements(array);   // Body

        System.out.println(result);             // 6
        
    }
}
