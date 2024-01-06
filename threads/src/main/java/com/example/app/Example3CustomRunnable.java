package com.example.app;

import com.example.app.utils.CountUtil;

public class Example3CustomRunnable {

	public static void main(String[] args) {
	
		Example3CustomRunnable main = new Example3CustomRunnable();		
		main.countByCustomRunnable(2);
		
	}
	
	public void countByCustomRunnable(int threadsCount) {
		
		Thread thread;
		for (int i = 1; i <= threadsCount; i++) {
			thread = new Thread(new CustomRunnable());
			thread.setName("Thread-" + i);
			thread.start();
		}
			
	}

}

class CustomRunnable implements Runnable {

	@Override
	public void run() {
		CountUtil.count();				
	}
	
}