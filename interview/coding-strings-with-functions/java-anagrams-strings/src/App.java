import java.util.Arrays;

public class App {

    private static boolean areStringsAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null)
            return false;

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }

    public static void main(String[] args) {
        
        String str1 = "listen";
        String str2 = "silent";                             // Input

        boolean result = areStringsAnagrams(str1, str2);    // Process

        System.out.println("Result: " + result);            // Output: true

    }

}
