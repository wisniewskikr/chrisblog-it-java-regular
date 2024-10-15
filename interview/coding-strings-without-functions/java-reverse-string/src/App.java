public class App {

    private static String reverseWords(String words) {

        if (words == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = words.length() - 1; i >= 0; i--) {
            sb.append(words.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        
        String words = "Hello World";                       // Input

        String result = reverseWords(words);                // Process

        System.out.println("Result: " + result);            // Output: "dlroW olleH"

    }

}
