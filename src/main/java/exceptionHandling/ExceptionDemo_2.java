package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		try {
		System.out.println("Program Started");
		System.out.println(" Enter the position [0 to 4]: ");
		
		int pos = sc.nextInt(); // If you enter 5 will give ArrayIndexOutOfBoundsException
		System.out.println(" Enter the value for position: ");
		int val = sc.nextInt();
		a[pos] = val;
		System.out.println("Program Ended"+a[pos]);
		}
		catch(Exception e) {
			System.out.println("Exception Cathced");
			System.out.println("Error in code"+e.getMessage());
		}
		System.out.println("Program Exited");

	}

}
