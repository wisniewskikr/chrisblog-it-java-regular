## Goal

Goal of this project is to create multiple thread example with usage **CountDownLatch** class.

## Explanation

A **CountDownLatch** in Java is a synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes. 

## Hints

Hints:
* Create CountDownLatch with some count
* Pass CountDownLatch to some Thread
* In a Thread call CountDownLatch.countDown() to decrease count
* In Main call CountDownLatch.await() until count will be 0
