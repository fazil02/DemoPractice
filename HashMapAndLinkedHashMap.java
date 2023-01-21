package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapAndLinkedHashMap {

	public static  void main(String[] args) {
		//order or insertion is not preserved
		HashMap hm = new HashMap();
		hm.put(10,"fazil");
		hm.put(7,"dhoni");
		hm.put(19,"sachin");
		System.out.println(hm);
		//for accessing we use iterator
	Collection	c=hm.values();//fetching only values
	Iterator i=c.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	Set k=hm.keySet();//fetching only keys
	Iterator a=k.iterator();
	
	while(a.hasNext())
	{
		System.out.println(a.next());
	}
	System.out.println("*********");
	
	Set k1=hm.entrySet();//fetching both keys and values
	Iterator b=k1.iterator();
	
	while(b.hasNext())
	{
		System.out.println(b.next());
	}
		//order of insertion is preserved
		LinkedHashMap hm1 = new LinkedHashMap();
		hm1.put(10,"fazil");
		hm1.put(7,"dhoni");
		System.out.println(hm1);
		
	
		

	}

}
