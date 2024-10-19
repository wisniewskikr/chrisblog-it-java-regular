import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class HelloWorldRunAsync {

    public CompletableFuture<Void> runAsync(ExecutorService executor) {
        
        return CompletableFuture.runAsync(() -> {
            System.out.println(getMessage());                         
        }, executor);

    }

    public String getMessage() {
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}