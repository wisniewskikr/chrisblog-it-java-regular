package com.example.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.example.app.utils.CountUtil;

public class Example7ExecutorServiceCallableWithFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		Example7ExecutorServiceCallableWithFuture main = new Example7ExecutorServiceCallableWithFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			Future<String> future = executorService.submit(new Example7CustomCallable());
			// Please comment this line for getting async againt
			System.out.println(future.get());			
		}
		executorService.shutdown();		
			
	}

}

class Example7CustomCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		return CountUtil.count();
	}	
	
}