

public class GoodbyeGreeting implements GreetingState {
    @Override
    public void greet(GreetingContext context) {
        System.out.println("Goodbye, World!");
        context.setGreetingState(new HelloGreeting());
    }
}