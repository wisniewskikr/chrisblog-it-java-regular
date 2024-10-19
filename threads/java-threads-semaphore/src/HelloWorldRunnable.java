import java.util.concurrent.Semaphore;

public class HelloWorldRunnable implements Runnable {

    private Semaphore semaphore;

    public HelloWorldRunnable(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(getMessage());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        
    }

    public String getMessage() {        
        return "Hello World, " + Thread.currentThread().getName();
    }
    
}