

public class HelloWorldRunnable implements Runnable {

    @Override
    public void run() {
        String message = getMessage();
        System.out.println(message);
    }

    public String getMessage() {
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}