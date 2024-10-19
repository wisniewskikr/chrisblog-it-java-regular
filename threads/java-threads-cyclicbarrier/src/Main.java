import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("All threads have reached the barrier and can proceed.");
            }
        });

        executorService.submit(new HelloWorldRunnable(barrier));
        executorService.submit(new HelloWorldRunnable(barrier));

        executorService.shutdown();

    }
}
