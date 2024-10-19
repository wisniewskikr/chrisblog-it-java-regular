

public class HelloGreeting implements GreetingState {
    @Override
    public void greet(GreetingContext context) {
        System.out.println("Hello, World!");
        context.setGreetingState(new GoodbyeGreeting());
    }
}