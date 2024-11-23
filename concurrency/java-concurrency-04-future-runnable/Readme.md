##### Goal

The goal of this project is to present how to create **concurrency** in **Java** programming language using **Future** class with interface **Runnable**. Interface Runnable does not return anything. Class Future is always used together with **ExecutorService** class. Class Future can be created in following ways:
* **Classic**: create new class which implements interface Runnable
* **Abstract Method**: create interface Runnable directly without new class
* **Lambda**: implement interface Runnable as Lamda

In this example we expect message: **Hello World, Stranger**. This message is combination of results of two separate cuncurrent threads:
* **Text Thread**: this thread is delayed for 3 seconds and returns text "Hello World"
* **User Thread**: this thread is deleyed for 1 second and returns text "Strenger"

##### Terminology

* **Java**: Java is a versatile, object-oriented, high-level programming language designed for building platform-independent applications.
* **Concurrency**: concurrency in Java refers to the ability of a program to execute multiple tasks simultaneously, improving efficiency and performance.
* **Future class**: in Java, the Future class (part of the java.util.concurrent package) represents the result of an asynchronous computation. It provides methods to check if the computation is complete, wait for its completion, and retrieve the result of the computation once it is done.
* **Runnable interface**: the Runnable interface in Java is a functional interface that is part of the java.lang package. It is designed to provide a common protocol for objects that wish to execute code while being run on a separate thread.
* **ExecutorService class**: ExecutorService is a part of Java's concurrency framework in the java.util.concurrent package. It provides a higher-level API for managing and controlling thread execution compared to manually creating and managing threads.

##### Images

![My Image](readme-images/image-01.png)

##### Usage

To run this project please run **main()** method in the **Main** class.