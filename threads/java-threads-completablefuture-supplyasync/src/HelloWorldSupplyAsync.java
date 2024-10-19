import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class HelloWorldSupplyAsync {

    public CompletableFuture<String> supplyAsync(ExecutorService executor) {
        
        return CompletableFuture.supplyAsync(() -> {
            return getMessage();                         
        }, executor);

    }

    public String getMessage() {
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}