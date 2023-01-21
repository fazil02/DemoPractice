package com.collection;

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		//internally uses bineary search
	TreeSet ts = new TreeSet();
	ts.add(5);
	ts.add(50);
	ts.add(60);
	ts.add(35);
	ts.add(20);
	ts.add(20);//duplicates are not awolled in treeset
	System.out.println(ts);

	}

}
