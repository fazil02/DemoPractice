package com.collection;

import java.util.LinkedList;

public class LLProgram {

	public static void main(String[] args) {
		
		//interally uses doubly linked list
		//best when we use insertion and deteltion of data
		LinkedList ll1 = new LinkedList();
		ll1.add("fazil");
		ll1.add(25);
		ll1.add("ATC");
		System.out.println(ll1);
		
		ll1.addFirst("my details");
		System.out.println(ll1);
		ll1.add("perficient");
		System.out.println(ll1);

	}

}
