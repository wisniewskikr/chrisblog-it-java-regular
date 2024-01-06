package com.example.app;

import com.example.app.utils.CountUtil;

public class Example2CustomThread {

	public static void main(String[] args) {
	
		Example2CustomThread main = new Example2CustomThread();			
		main.countByCustomThread(2);
		
	}
	
	public void countByCustomThread(int threadsCount) {
		
		Thread thread;
		for (int i = 1; i <= threadsCount; i++) {
			thread = new CustomThread();
			thread.setName("Thread-" + i);
			thread.start();
		}
			
	}

}

class CustomThread extends Thread {
	
	@Override
	public void run() {
		CountUtil.count();				
	}
	
}