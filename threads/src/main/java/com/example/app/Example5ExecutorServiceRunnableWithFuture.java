package com.example.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.app.utils.CountUtil;

public class Example5ExecutorServiceRunnableWithFuture {

	public static void main(String[] args) {
	
		Example5ExecutorServiceRunnableWithFuture main = new Example5ExecutorServiceRunnableWithFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			executorService.submit(new Example4CustomRunnable());			
		}
		executorService.shutdown();		
			
	}

}

class Example4CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}