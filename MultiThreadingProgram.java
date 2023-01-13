package com.multi;

class Demo1 extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("child thread");	
		}
		
	}
}

public class MultiThreadingProgram {

	public static void main(String[] args) {
		
     Demo1 d = new Demo1();
    
     d.start();
     System.out.println("main thread");
	}

}
