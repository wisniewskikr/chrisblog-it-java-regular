import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executor = Executors.newFixedThreadPool(2);

        HelloWorldSupplyAsync helloWorld = new HelloWorldSupplyAsync();

        CompletableFuture<String> compFuture1 = helloWorld.supplyAsync(executor);
        CompletableFuture<String> compFuture2 = helloWorld.supplyAsync(executor);

        CompletableFuture.allOf(compFuture1, compFuture2).join();

        System.out.println(compFuture1.get());
        System.out.println(compFuture2.get());

        executor.shutdown();

    }
}
