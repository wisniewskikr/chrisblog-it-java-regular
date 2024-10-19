## Goal

Goal of this project is to create multiple thread example with usage **ExecutorService**, **Future** and **Callable** interface.

## Explanation

**Future.submit()** method accepts Runnable (witout any result) or Callable (with a result) interface. 

## Hints

Hints:
* Create ExecutorService using Executors helper class
* Call ExecutorService.submit() method. Object Future should be received as a result
* Call Future.get() to run new threads. Callable should return some result
* Call ExecutorService.shutdown() to close threads
