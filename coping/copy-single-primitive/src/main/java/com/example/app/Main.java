package com.example.app;

public class Main {

	public static void main(String[] args) {
		
		int origin = 0;
		int copy = 3;
		
		System.out.println("Origin: " + origin);
		System.out.println("Copy: " + copy);
		copy = origin;
		System.out.println("Origin after coping: " + origin);
		System.out.println("Copy Origin after coping: " + copy);
		copy = 7;
		System.out.println("Origin after Copy change: " + origin);
		System.out.println("Copy Origin after change: " + copy);	

	}	
	
}
