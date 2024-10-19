## Goal

Goal of this project is to create multiple thread example with usage **ExecutorService** and **CompletableFuture** with method **runAsync()** (this method does not return anything).

## Explanation

**CompletableFuture.runAsync()** method starts threads and **CompletableFuture.join()** waits for all results.

## Hints

Hints:
* Create ExecutorService using Executors helper class
* Call CompletableFuture.runAsync() and get CompletableFuture<Void> using ExecutorService as an argument
* Call ComletableFuture.allOf() and ComletableFuture.join()