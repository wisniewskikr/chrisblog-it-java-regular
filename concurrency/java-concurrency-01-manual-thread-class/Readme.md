##### Goal

In Java, a thread can be created by extending the Thread class. This involves defining a class that inherits from Thread and overriding its run() method with the code you want to execute concurrently. Once an instance of this class is created, you start the thread by calling its start() method, which internally calls the overridden run() method.