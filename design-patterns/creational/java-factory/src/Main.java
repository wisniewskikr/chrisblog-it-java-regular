public class Main {

    public static void main(String[] args) {

        GreetingFactory factory = new GreetingFactory();

        // Create a HelloGreeting
        Greeting helloGreeting = factory.createGreeting("hello");
        helloGreeting.greet();  // Outputs: Hello, World!

        // Create a GoodbyeGreeting
        Greeting goodbyeGreeting = factory.createGreeting("goodbye");
        goodbyeGreeting.greet();  // Outputs: Goodbye, World!
        
    }
}
