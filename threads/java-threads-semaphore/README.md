## Goal

Goal of this project is to create multiple thread example with usage **Semaphore** class. User has to wait 3 seconds between messages from Threads because Semaphore permits only one call at the same time.

## Explanation

**Semaphores** are used to control access to a shared resource by multiple threads in a concurrent environment.

## Hints

Hints:
* Create Semaphore with some permits count
* Pass Semaphore to Threads
* In a Thread call Semaphore.acquire() (to check permissions) and Semaphore.release() to release resource