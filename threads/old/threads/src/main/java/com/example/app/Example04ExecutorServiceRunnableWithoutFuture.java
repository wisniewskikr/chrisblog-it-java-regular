package com.example.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.app.utils.CountUtil;

public class Example04ExecutorServiceRunnableWithoutFuture {

	public static void main(String[] args) {
	
		Example04ExecutorServiceRunnableWithoutFuture main = new Example04ExecutorServiceRunnableWithoutFuture();			
		main.countByExecutorService(2);
		
	}
	
	public void countByExecutorService(int threadsCount) {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		for (int i = 1; i <= threadsCount; i++) {			
			executorService.submit(new Example04CustomRunnable());			
		}
		executorService.shutdown();		
			
	}

}

class Example04CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}