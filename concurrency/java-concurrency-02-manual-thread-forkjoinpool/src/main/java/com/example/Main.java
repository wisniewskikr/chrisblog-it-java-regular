package com.example;

import java.util.concurrent.ForkJoinPool;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException {

        // START SECTION
        System.out.println("Project start in the Thread: " + Thread.currentThread().getName());
        long start = System.currentTimeMillis();


        Main main = new Main();
        String message = main.getMessage();
        System.out.println("Message: " + message);

        
        // END SECTION
        long end = System.currentTimeMillis();
        System.out.println("Project end in the Thread: " + 
            Thread.currentThread().getName() + 
            ". Duration in ms: " +
            (end - start));
            
        }
    
        public String getMessage() throws InterruptedException {
            
            String[] parts = new String[2];
            ForkJoinPool fjp = new ForkJoinPool(2);

            Thread textThread = getTextThread(parts, fjp);
            Thread userThread = getUserThread(parts, fjp);

            textThread.start();
            userThread.start();

            textThread.join();
            userThread.join();

            return parts[0] + ", " + parts[1];

        }

        public Thread getTextThread(String[] parts, ForkJoinPool fjp) {

            return new Thread(() -> fjp.submit(() -> {

                try {
                    System.out.println("Text is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    parts[0] = "Hello World";
                    System.out.println("Text was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).invoke());

        }

        public Thread getUserThread(String[] parts, ForkJoinPool fjp) {

            return new Thread(() -> fjp.submit(() -> {

                try {
                    System.out.println("User is processing by the Thread: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    parts[1] = "Stranger";
                    System.out.println("User was processed by the Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).invoke());

        }

}
