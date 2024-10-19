import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CountDownLatch latch = new CountDownLatch(2);
        executorService.submit(new HelloWorldRunnable(latch));
        executorService.submit(new HelloWorldRunnable(latch));
        latch.await();

        executorService.shutdown();

        System.out.println("Hello World, Main Thread!");

    }
}
