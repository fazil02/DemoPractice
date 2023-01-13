package com.multi;
 class Sample1 extends Thread
{
	public void run()
	{
		System.out.println("priorty of child thread ::"+Thread.currentThread().getPriority());
	}
}

public class SampleMTPrograms {

	public static void main(String[] args) {
		System.out.println("priorty of main thread ::"+Thread.currentThread().getPriority());
        Sample1 s1 = new Sample1();
        s1.setPriority(2);
        s1.start();
	}

}
