## Goal

Goal of this project is to create multiple thread example with usage **ExecutorService** and **CompletableFuture** with method **supplyAsync()** (this method returns a result).

## Explanation

**CompletableFuture.supplyAsync()** method starts threads, **CompletableFuture.join()** waits for all results and **CompletableFuture.get()** gets result.

## Hints

Hints:
* Create ExecutorService using Executors helper class
* Call ComletableFuture.supplyAsync() and get CompletableFuture<String> using ExecutorService as an argument
* Call ComletableFuture.allOf() and ComletableFuture.join()
* Call ComletableFuture.get()