package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException, ExecutionException {

        // START SECTION
        System.out.println("Project start in the Thread: " + Thread.currentThread().getName());
        long start = System.currentTimeMillis();


        Main main = new Main();

        // Classic
        // String message = main.getMessageClassic();

        // Abstract Method
        // String message = main.getMessageAbstractMethod();

        // Lambda
        String message = main.getMessageLambda();

        System.out.println("Message: " + message);

        
        // END SECTION
        long end = System.currentTimeMillis();
        System.out.println("Project end in the Thread: " + 
            Thread.currentThread().getName() + 
            ". Duration in ms: " +
            (end - start));
            
        }
    
        public String getMessageClassic() throws InterruptedException, ExecutionException {
            
            String[] parts = new String[2];

            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<?> textFurute = executorService.submit(new TextRunnable(parts));
            Future<?> userFurute = executorService.submit(new UserRunnable(parts));

            textFurute.get();
            userFurute.get();

            executorService.shutdown();

            return parts[0] + ", " + parts[1];

        }

        public String getMessageAbstractMethod() throws InterruptedException, ExecutionException {
            
            String[] parts = new String[2];

            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<?> textFurute = executorService.submit(new Runnable() {

                @Override
                public void run() {
                    
                    try {
                        System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(3000);
                        parts[0] = "Hello World";
                        System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                
            });

            Future<?> userFurute = executorService.submit(new Runnable() {
                
                @Override
                public void run() {
                    
                    try {
                        System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        parts[1] = "Stranger";
                        System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            });

            textFurute.get();
            userFurute.get();

            executorService.shutdown();

            return parts[0] + ", " + parts[1];

        }

        public String getMessageLambda() throws InterruptedException, ExecutionException {
            
            String[] parts = new String[2];

            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<?> textFurute = executorService.submit(() ->

                {
                    
                    try {
                        System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(3000);
                        parts[0] = "Hello World";
                        System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                
            );

            Future<?> userFurute = executorService.submit(() ->
                
                {
                    
                    try {
                        System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        parts[1] = "Stranger";
                        System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            );

            textFurute.get();
            userFurute.get();

            executorService.shutdown();

            return parts[0] + ", " + parts[1];

        }

        class TextRunnable implements Runnable {

            String[] parts;                

            public TextRunnable(String[] parts) {
                this.parts = parts;
            }

            @Override
            public void run() {
                
                try {
                    System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    parts[0] = "Hello World";
                    System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

        class UserRunnable implements Runnable {

            String[] parts;                

            public UserRunnable(String[] parts) {
                this.parts = parts;
            }

            @Override
            public void run() {
                
                try {
                    System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    parts[1] = "Stranger";
                    System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }


}
