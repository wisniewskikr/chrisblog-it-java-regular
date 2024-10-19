public class App {

    public static void main(String[] args) {

        Greeting greeting = new Greeting.GreetingBuilder()
            .addWord("Hello")
            .addSpace()
            .addWord("World")
            .addExclamationMark()
            .build();

        System.out.println(greeting.getMessage());
        
    }
}
