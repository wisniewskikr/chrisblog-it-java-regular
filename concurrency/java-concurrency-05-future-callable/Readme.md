##### Goal

The goal of this project is to present how to create **concurrency** in **Java** programming language using **Future** class with interface **Callable**. Interface Callable hat to return something. Class Future is always used together with **ExecutorService** class. Class Future can be created in following ways:
* **Classic**: create new class which implements interface Runnable
* **Abstract Method**: create interface Runnable directly without new class
* **Lambda**: implement interface Runnable as Lamda

In this example we expect message: **Hello World, Stranger**. This message is combination of results of two separate cuncurrent threads:
* **Text Thread**: this thread is delayed for 3 seconds and returns text "Hello World"
* **User Thread**: this thread is deleyed for 1 second and returns text "Strenger"

##### Terminology

* **Java**: Java is a versatile, object-oriented, high-level programming language designed for building platform-independent applications.
* **Concurrency**: concurrency in Java refers to the ability of a program to execute multiple tasks simultaneously, improving efficiency and performance.
* **Future class**:
* **Callable interface**:
* **ExecutorService class**:

##### Images

![My Image](readme-images/image-01.png)

##### Usage

To run this project please run **main()** method in the **Main** class.