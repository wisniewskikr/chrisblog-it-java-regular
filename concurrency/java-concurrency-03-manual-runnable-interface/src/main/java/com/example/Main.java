package com.example;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException {

        // START SECTION
        System.out.println("Project start in the Thread: " + Thread.currentThread().getName());
        long start = System.currentTimeMillis();


        Main main = new Main();
        // Classic
        // String message = main.getMessageRunnableClassic();
        // Abstract Method
        String message = main.getMessageRunnableAbstractMethod();
        System.out.println("Message: " + message);

        
        // END SECTION
        long end = System.currentTimeMillis();
        System.out.println("Project end in the Thread: " + 
            Thread.currentThread().getName() + 
            ". Duration in ms: " +
            (end - start));
            
        }
    
        public String getMessageRunnableClassic() throws InterruptedException {
            
            String[] parts = new String[2];

            Thread textThread = new Thread(new TextRunnable(parts));
            Thread userThread = new Thread(new UserRunnable(parts));

            textThread.start();
            userThread.start();

            textThread.join();
            userThread.join();

            return parts[0] + ", " + parts[1];

        }

        public String getMessageRunnableAbstractMethod() throws InterruptedException {
            
            String[] parts = new String[2];

            Thread textThread = new Thread(new Runnable() {

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

            Thread userThread = new Thread(new Runnable() {
                
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

            textThread.start();
            userThread.start();

            textThread.join();
            userThread.join();

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
