package com.example.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.app.utils.CountUtil;

public class Example6ExecutorServiceCallableWithoutFuture {

	public static void main(String[] args) {
	
		Example6ExecutorServiceCallableWithoutFuture main = new Example6ExecutorServiceCallableWithoutFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			executorService.submit(new Example6CustomCallable());			
		}
		executorService.shutdown();		
			
	}

}

class Example6CustomCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		return CountUtil.count();
	}	
	
}