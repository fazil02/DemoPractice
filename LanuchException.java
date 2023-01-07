package ExceptionHandling;

import java.util.Scanner;

public class LanuchException {

	public static void main(String[] args) {
		try {
		System.out.println("Connection is established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the frst number");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        
        int c = a/b;
        System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("you have entered wrong number please enter correct number");
		}
        System.out.println("application terminated");
	}

}
