package com.example.app;

import com.example.app.utils.CountUtil;

public class Example1AnonimousMethod {

	public static void main(String[] args) {
	
		Example1AnonimousMethod main = new Example1AnonimousMethod();		
		main.countByAnonimousMethod(2);

		
	}
	
	public void countByAnonimousMethod(int threadsCount) {
		
		Thread thread;
		for (int i = 1; i <= threadsCount; i++) {
			thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					CountUtil.count();				
				}
				
			});
			thread.setName("Thread-" + i);
			thread.start();
		}
			
	}

}