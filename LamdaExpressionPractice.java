package com.Lamda;
@FunctionalInterface
interface Laptop
{
	void show();
}
@FunctionalInterface
interface Add
{
	void Addition();
}
@FunctionalInterface
interface Sub
{
	int subraction(int x, int y);
}

public class LamdaExpressionPractice {

	public static void main(String[] args) {
		Laptop l = ()->{
			System.out.println("print some message in laptop");
			
		};
		l.show();
		
		Add add = () -> {
			int a = 10;
			int b = 20;
			int c =a+b;
			System.out.println(c);
		};
       add.Addition();
       
       Sub sub = (x,y) -> {
    	 int  res = x-y;
    	 return res;
    	   
       };
       int m=sub.subraction(20,10);
       System.out.println(m);
	}

}
