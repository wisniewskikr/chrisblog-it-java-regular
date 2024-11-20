package com.example;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException {

        System.out.println("Project start in the Thread: " + Thread.currentThread().getName());
        long start = System.currentTimeMillis();

        Main main = new Main();
        String message = main.getMessage();
        System.out.println("Message: " + message);

        long end = System.currentTimeMillis();
        System.out.println("Project end in the Thread: " + 
            Thread.currentThread().getName() + 
            ". Duration in ms: " +
            (end - start));
            
        }
    
        public String getMessage() throws InterruptedException {
            
            String[] parts = new String[2];

            Thread textThread = new TextThread(parts);
            Thread userThread = new UserThread(parts);

            textThread.start();
            userThread.start();

            textThread.join();
            userThread.join();

            return parts[0] + ", " + parts[1];

        }

        class TextThread extends Thread {

            String[] parts;                

            public TextThread(String[] parts) {
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

        class UserThread extends Thread {

            String[] parts;                

            public UserThread(String[] parts) {
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
