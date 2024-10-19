import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(2);

        HelloWorldRunAsync helloWorld = new HelloWorldRunAsync();

        CompletableFuture<Void> compFuture1 = helloWorld.runAsync(executor);
        CompletableFuture<Void> compFuture2 = helloWorld.runAsync(executor);

        CompletableFuture.allOf(compFuture1, compFuture2).join();

        executor.shutdown();

    }
}
