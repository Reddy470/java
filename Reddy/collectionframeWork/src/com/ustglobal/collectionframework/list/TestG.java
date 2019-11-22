package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(32.4);
		li.add("more");
		li.add(true);

		
		System.out.println("=====using for loop=====");
		for(int  i =0; i<li.size();i++) {
			System.out.println(i);
			
		}
		System.out.println("===== for each=====");
		for(Object obj: li) {
			System.out.println(obj);
		}
		System.out.println("====using iterator=====");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.hasNext();
			System.out.println(o);
		}
		System.out.println("=========list itrerator======");
		ListIterator it1 = li.listIterator();
		while(it1.hasNext()) {
			Object o = it1.hasNext();
			System.out.println(o);
		}
		while (it1.hasPrevious()) {
			Object o = it1.previous();
			System.out.println(o);
		}
		
	}
}
