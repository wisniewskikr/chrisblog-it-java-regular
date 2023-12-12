package com.example;

public class Main {

	public static void main(String[] args) {
		
		MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {

			@Override
			public void displayGreet() {
				System.out.println("Hello World from Anonymous Method!");
			}
			
		};

		MyFunctionalInterface myFunctionalInterface2 = () -> System.out.println("Hello World from Lambda!");

		myFunctionalInterface1.displayGreet();
		myFunctionalInterface2.displayGreet();
		
	}

	
}