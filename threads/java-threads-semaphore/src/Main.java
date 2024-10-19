import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Semaphore semaphore = new Semaphore(1);
        executorService.submit(new HelloWorldRunnable(semaphore));
        executorService.submit(new HelloWorldRunnable(semaphore));

        executorService.shutdown();

    }
}
