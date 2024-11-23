package com.example;

import java.util.concurrent.Callable;
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
                        
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<String> textFurute = executorService.submit(new TextCallable());
            Future<String> userFurute = executorService.submit(new UserCallable());

            String text = textFurute.get();
            String user = userFurute.get();

            executorService.shutdown();

            return text + ", " + user;

        }

        public String getMessageAbstractMethod() throws InterruptedException, ExecutionException {
            
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<String> textFurute = executorService.submit(new Callable<String>() {

                @Override
                public String call() throws Exception {

                    String result = null;

                    try {
                        System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(3000);
                        result = "Hello World"; 
                        System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    return result;

                }
                
                
            });

            Future<String> userFurute = executorService.submit(new Callable<String>() {
                
                @Override
                public String call() throws Exception {

                    String result = null;
                    
                    try {
                        System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        result = "Stranger";
                        System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    return result;

                }

            });

            String text = textFurute.get();
            String user = userFurute.get();

            executorService.shutdown();

            return text + ", " + user;

        }

        public String getMessageLambda() throws InterruptedException, ExecutionException {
            
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            
            Future<String> textFurute = executorService.submit(() ->

                {
                    
                    String result = null;

                    try {
                        System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(3000);
                        result = "Hello World"; 
                        System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    return result;

                }
                
            );

            Future<String> userFurute = executorService.submit(() ->
                
                {
                    
                    String result = null;
                    
                    try {
                        System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        result = "Stranger";
                        System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    return result;

                }

            );

            String text = textFurute.get();
            String user = userFurute.get();

            executorService.shutdown();

            return text + ", " + user;

        }

        class TextCallable implements Callable<String> {

            @Override
            public String call() throws Exception {

                String result = null;

                try {
                    System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    result = "Hello World"; 
                    System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return result;

            }

        }

        class UserCallable implements Callable<String> {

            @Override
            public String call() throws Exception {

                String result = null;
                
                try {
                    System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    result = "Stranger";
                    System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return result;

            }

        }


}
