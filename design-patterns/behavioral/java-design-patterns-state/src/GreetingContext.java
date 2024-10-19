

public class GreetingContext {
    
    private GreetingState greetingState;

    public GreetingContext(GreetingState greetingState) {
        this.greetingState = greetingState;
    }

    public void setGreetingState(GreetingState greetingState) {
        this.greetingState = greetingState;
    }

    public void greet() {
        greetingState.greet(this);
    }

}