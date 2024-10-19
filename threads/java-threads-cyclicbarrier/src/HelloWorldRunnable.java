import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.lang.Math;

public class HelloWorldRunnable implements Runnable {

    private CyclicBarrier barrier;

    public HelloWorldRunnable(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is working...");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(getMessage());
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        
    }

    public String getMessage() {        
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}