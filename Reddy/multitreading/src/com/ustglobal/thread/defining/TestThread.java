package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("Main Starts");

		MyThread t1 = new MyThread();

		/*
		 * Don't call run() method it behaves like normal program
		 * All code will be executed inside main thread only
		 */		
//         t1.run();   
		t1.start();
								// t1.start(); ILLEGAL ThreadStateException
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main Stops");

	}

}
