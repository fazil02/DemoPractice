package com.Lamda;

@FunctionalInterface
interface Demo
{
	void display();
	
}
//class Simple implements Demo
//{
//	public void display()
//	{
//		System.out.println("hello");
//	}
//}


public class FunctionalInterfacePractice {

	public static void main(String[] args) {
		
//		Demo s = new Simple();
//		s.display();
		Demo d = ()->System.out.println("Hello Buddy");
		d.display();

	}

}
