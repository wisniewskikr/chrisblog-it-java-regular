package com.example.app;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.example.app.utils.CountUtil;

public class Example5ExecutorServiceRunnableWithFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		Example5ExecutorServiceRunnableWithFuture main = new Example5ExecutorServiceRunnableWithFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			Future<?> future = executorService.submit(new Example5CustomRunnable());
			// Comment this for async
			future.get();			
		}
		executorService.shutdown();		
			
	}

}

class Example5CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}