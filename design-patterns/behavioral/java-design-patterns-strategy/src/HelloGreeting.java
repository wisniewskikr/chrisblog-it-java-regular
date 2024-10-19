

public class HelloGreeting implements GreetingStrategy {
    @Override
    public void greet() {
        System.out.println("Hello, World!");
    }
}