package ExceptionHandling;

import java.util.Scanner;

class ThrowingClass
{
	void Alpha() throws ArithmeticException {
		try {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int a=scan.nextInt();
	System.out.println("Enter the number");
	int b=scan.nextInt();
	
	int c = a/b;
	System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled..!");
			throw e;
		}
		finally {
		System.out.println("terminated");
	}}

}

public class RethrowingException {

	public static void main(String[] args) {
		try {
				ThrowingClass tc= new ThrowingClass();
				tc.Alpha();
				
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is also handled in main method..");
		}
	}

}
