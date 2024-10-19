public class Main {

    public static void main(String[] args) {

        GreetingContext context = new GreetingContext(new HelloGreeting());
        context.greet();
        context.greet();   
        context.greet(); 
        context.greet();  

    }
}
