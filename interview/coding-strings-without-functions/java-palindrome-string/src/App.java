public class App {

    private static boolean isPalindrome(String word) {

        if (word == null)
            throw new IllegalArgumentException("Word can not be null.");

        String reverseWord = null;
        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        reverseWord = sb.toString();

        return word.equals(reverseWord);

    }

    public static void main(String[] args) {
        
        String word = "level";                              // Input

        boolean result = isPalindrome(word);                // Process

        System.out.println("Result: " + result);            // Output: true

    }

}
