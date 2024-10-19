import java.util.concurrent.Callable;

public class HelloWorldCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return getMessage();
    }

    public String getMessage() {
        return "Hello World, " + Thread.currentThread().getName();
    }    
    
}