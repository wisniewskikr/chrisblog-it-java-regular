

public class GreetingContext {
    
    private GreetingStrategy greeting;

    public GreetingContext(GreetingStrategy greeting) {
        this.greeting = greeting;
    }

    public void setGreeting(GreetingStrategy greeting) {
        this.greeting = greeting;
    }

    public void greet() {
        greeting.greet();
    }

}