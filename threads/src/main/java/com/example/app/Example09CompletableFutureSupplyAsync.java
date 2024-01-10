package com.example.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Example09CompletableFutureSupplyAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Example09CompletableFutureSupplyAsync main = new Example09CompletableFutureSupplyAsync();			
		main.displayResultByCompletabeFuture(2);
		main.displayResultByCompletableFutureWithExecutorService(2);
		
	}
	
	public void displayResultByCompletabeFuture(int threadsCount) throws InterruptedException, ExecutionException {

		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture.supplyAsync(new Example09CustomSupplier());
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();		
		System.out.println(array[0].get());
		System.out.println(array[1].get());
			
	}

	public void displayResultByCompletableFutureWithExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		
		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture.supplyAsync(new Example09CustomSupplier(), executorService);
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();
		System.out.println(array[0].get());
		System.out.println(array[1].get());	

		executorService.shutdown();
			
	}

}

class Example09CustomSupplier implements Supplier<String> {

	@Override
	public String get() {
		return "Hello World!";
	}	
	
}