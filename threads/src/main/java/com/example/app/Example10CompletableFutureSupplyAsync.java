package com.example.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Example10CompletableFutureSupplyAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Example10CompletableFutureSupplyAsync main = new Example10CompletableFutureSupplyAsync();			
		main.displayResultByCompletabeFuture(2);
		main.displayResultByCompletableFutureWithExecutorService(2);
		
	}
	
	public void displayResultByCompletabeFuture(int threadsCount) throws InterruptedException, ExecutionException {

		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture.supplyAsync(new Example10CustomSupplier());
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
			array[i - 1] = CompletableFuture.supplyAsync(new Example10CustomSupplier(), executorService);
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();
		System.out.println(array[0].get());
		System.out.println(array[1].get());	

		executorService.shutdown();
			
	}

}

class Example10CustomSupplier implements Supplier<String> {

	@Override
	public String get() {
		return "Hello World!";
	}	
	
}