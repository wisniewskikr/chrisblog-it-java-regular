package com.example.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.app.utils.CountUtil;

public class Example08CompletableFutureRunAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Example08CompletableFutureRunAsync main = new Example08CompletableFutureRunAsync();			
		main.countByCompletabeFuture(2);
		main.countByCompletableFutureWithExecutorService(2);
		
	}
	
	public void countByCompletabeFuture(int threadsCount) throws InterruptedException, ExecutionException {

		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture.runAsync(new Example08CustomRunnable());
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();	
			
	}

	public void countByCompletableFutureWithExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		
		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture.runAsync(new Example08CustomRunnable(), executorService);
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();	
			
	}

}

class Example08CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}