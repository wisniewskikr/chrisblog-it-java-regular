package com.example.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.example.app.utils.CountUtil;

public class Example10CompletableFutureSupplyAsyncThen {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Example10CompletableFutureSupplyAsyncThen main = new Example10CompletableFutureSupplyAsyncThen();			
		main.displayResultByCompletabeFuture(2);
		main.displayResultByCompletableFutureWithExecutorService(2);
		
	}
	
	public void displayResultByCompletabeFuture(int threadsCount) throws InterruptedException, ExecutionException {

		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture
							.supplyAsync(new Example10CustomSupplier())
							.thenApply(new Example10CustomFunction())
							.thenAccept(new Example10CustomConsumer())
							.thenRun(new Example10CustomRunnable());
							
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();
		array[0].get();
		array[1].get();	
			
	}

	public void displayResultByCompletableFutureWithExecutorService(int threadsCount) throws InterruptedException, ExecutionException {
			
		ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
		
		CompletableFuture<?>[] array = new CompletableFuture<?>[threadsCount];		
		
		for (int i = 1; i <= threadsCount; i++) {
			array[i - 1] = CompletableFuture
							.supplyAsync(new Example10CustomSupplier(), executorService)
							.thenApply(new Example10CustomFunction())
							.thenAccept(new Example10CustomConsumer())
							.thenRun(new Example10CustomRunnable());
		}

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(array);
		combinedFuture.get();
		array[0].get();
		array[1].get();	
		executorService.shutdown();	
			
	}

}

class Example10CustomSupplier implements Supplier<String> {

	@Override
	public String get() {
		return "Hello";
	}

}

class Example10CustomFunction implements Function<String, String> {

	@Override
	public String apply(String t) {
		return t + " World!";
	}	

}

class Example10CustomConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

class Example10CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}