package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main strats");
		int[] a  = {10,20,30};
		System.out.println(a[1]);
		try {
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("index is not present");
		}
		System.out.println("main  ends");
		
	}

}
