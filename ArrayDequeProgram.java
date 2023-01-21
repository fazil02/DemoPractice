package com.collection;

import java.util.ArrayDeque;

public class ArrayDequeProgram {

	public static void main(String[] args) {
		//index based insertion and deletion not awolled
		//internally uses doubly ended deque
		ArrayDeque ad = new ArrayDeque();
		ad.add(1);
		ad.add("fazil");
		System.out.println(ad);
	}

}
