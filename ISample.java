package com.Interface;

public interface ISample {
	
	void m1();
	void m2();
	

}

abstract class SampleImpl implements ISample
{
	 public void m1()
	{
		System.out.println("inside m1");
	}
}

class SubSample extends SampleImpl
{
	public void m2()
	{
		System.out.println("inside m2");
	}
}
