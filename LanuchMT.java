package com.multi;
class Demo2 extends Thread
{
//  public void start()
//  {
//	  System.out.println("start method");
//  }
  public void run()
  {
	  System.out.println("run method");
  }
}

public class LanuchMT {

	public static void main(String[] args) {
		
Demo2 d2=new Demo2();
d2.start();

System.out.println("main method");
	}
}
