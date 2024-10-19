## Goal

Goal of this project is to create multiple thread example with usage **CyclicBarrier** class.

## Explanation

**A CyclicBarrier** in Java is used to synchronize threads that are working concurrently on different parts of a task. The idea is that all threads wait at a common barrier point until the last thread arrives, and then they can proceed together.

## Hints

Hints:
* Create CyclicBarrier with some parties count
* Pass CyclicBarrier to Threads
* In a Thread call CyclicBarrier.await() until all parties finish their work