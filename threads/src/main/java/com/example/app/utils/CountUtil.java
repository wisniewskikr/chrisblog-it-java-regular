package com.example.app.utils;

public class CountUtil {

    public static void count() {
		
		for (int i = 1; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i );
		}
		
	}
    
}
