package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetAndLinkedHashSet {

	public static void main(String[] args) {
		//it is fast for searching purposes like binarysearch
		//internally uses hashing algorthim
		//hash function and hashtable works together
		//order of insertion is not preserved
		
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(50);
		hs.add(25);
		hs.add(40);
		hs.add(40);//duplicates are not awolled
		System.out.println(hs);//priniting purpose
		//for accessing
		Iterator i=hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//order of insertion is not preserved

		LinkedHashSet hs1 = new LinkedHashSet();
		hs1.add(5);
		hs1.add(50);
		hs1.add(25);
		hs1.add(40);
		hs1.add(40);
		System.out.println(hs1);
		
		//for accessing
		Iterator i1=hs1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
