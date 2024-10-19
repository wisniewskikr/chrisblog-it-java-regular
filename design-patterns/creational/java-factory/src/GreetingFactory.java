

public class GreetingFactory {
    public Greeting createGreeting(String type) {
        if (type.equalsIgnoreCase("hello")) {
            return new HelloGreeting();
        } else if (type.equalsIgnoreCase("goodbye")) {
            return new GoodbyeGreeting();
        }
        return null;
    }
}