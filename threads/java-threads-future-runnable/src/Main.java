import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<?> future1 = executorService.submit(new HelloWorldRunnable());
        Future<?> future2 = executorService.submit(new HelloWorldRunnable());

        future1.get();
        future2.get();

        executorService.shutdown();

    }
}
