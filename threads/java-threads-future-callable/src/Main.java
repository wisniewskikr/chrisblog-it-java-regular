import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future1 = executorService.submit(new HelloWorldCallable());
        Future<String> future2 = executorService.submit(new HelloWorldCallable());

        System.out.println(future1.get());
        System.out.println(future2.get());

        executorService.shutdown();

    }
}
