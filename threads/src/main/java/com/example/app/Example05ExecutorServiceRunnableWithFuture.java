package com.example.app;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.example.app.utils.CountUtil;

public class Example05ExecutorServiceRunnableWithFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		Example05ExecutorServiceRunnableWithFuture main = new Example05ExecutorServiceRunnableWithFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			Future<?> future = executorService.submit(new Example05CustomRunnable());
			// Please comment this line for getting async againt
			future.get();			
		}
		executorService.shutdown();		
			
	}

}

class Example05CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}