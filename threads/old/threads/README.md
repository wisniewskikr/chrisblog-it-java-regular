THREADS
=======


DESCRIPTION
-----------

Goal of this project is to show how to work with threads in Java. 

Examples:
- **Example01AnonimousMethod**: Thread is created by anonymous method;
- **Example02CustomThread**: Thread is created as custom class extended Thread;
- **Example03CustomRunnable**: Thread is created as custom class implemented Runnable;
- **Example04ExecutorServiceRunnableWithoutFuture**: Thread is created as ExecutorService. Method submit() takes Runnable as argument. No class Future is returned;
- **Example05ExecutorServiceRunnableWithFuture**: Thread is created as ExecutorService. Method submit() takes Runnable as argument. Class Future is returned;
- **Example06ExecutorServiceCallableWithoutFuture**: Thread is created as ExecutorService. Method submit() takes Callable as argument and some object is returned. No class Future is returned;
- **Example07ExecutorServiceCallabeWithFuture**: Thread is created as ExecutorService. Method submit() takes Callable as argument and some object is returned. Class Future is returned;
- **Example08CompletableFutureRunAsync**: Thread is created as CompletableFuture. Method runAsync() takes Runnable as artument and nothing is returned. Class CompletableFuture is returned;
- **Example09CompletableFutureSupplyAsync**: Thread is created as CompletableFuture. Method supplyAsync() takes Supplier as artument and object is returned. Class CompletableFuture is returned;
- **Example10CompletableFutureSupplyAsyncThen**: Thread is created as CompletableFuture. Method supplyAsync() takes Supplier as artument and object is returned. Moreover pipeline of "then()" methods is used here. Class CompletableFuture is returned;


USAGE
-----

Please open class **Main** and run method **main()**.