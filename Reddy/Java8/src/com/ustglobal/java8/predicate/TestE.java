package com.ustglobal.java8.predicate;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		Supplier<Student> s = () -> new Student(2,"vijay",90.0);
		Student s1 = s.get();
		System.out.println("id is "+s1.id);
		System.out.println(" name is "+s1.name);
		System.out.println("percentage"+s1.percentage);
		
		Supplier<Integer> i = ()->20;
		int val = i.get();
		System.out.println("value is "+val);
		
		Supplier<String> sp = ()-> "Good evening";
		String v = sp.get();
		System.out.println("value is "+v);
	}
}
