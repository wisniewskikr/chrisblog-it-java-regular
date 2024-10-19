import java.util.concurrent.CountDownLatch;

public class HelloWorldRunnable implements Runnable {

    private CountDownLatch latch;

    public HelloWorldRunnable(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        String message = getMessage();
        System.out.println(message);
        latch.countDown();
    }

    public String getMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}