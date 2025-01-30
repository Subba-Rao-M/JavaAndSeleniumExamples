package exceptionHandling;

import java.util.Scanner;

/**
 * Exception will cause program termination and it is different from error
 * Error:
 * Syntax error: Missing ; { and not following java /programming syntax and it will be notified by IDE
 * Logical Error: Program will execute but the o/p is incorrect or not accurate
 * Exception: User mistake when invalid input is passed and above 2 are system mistake
 * Execution will happen step by step and if for any step if input is not correct it will throw exception and halt the program execution by not passing to next steps
 * Exception should be handled to proceed to next step in code
 * 
 *  Types of exception
 *  Checked exception - Java complier will identify and handle it and easy to handle like IO, file not found exception
 *  Unchecked exception - NOt identified by Java complier like null pointer, array index out of exception
 * try{
 * Statement which may throw exception
 * }
 * catch(Exceptionclass object){ // n number of catch blocks can have
 * }
 * catch(Exception e){ // If exception type is not known use Exception class which is parent class for all types for exceptions
 * }
 * finally{ // It will always execute irrespective if there is exception or not , finally will not have ()
 * Syso("Comment here")}
 * Finally block will execute if exception occurred and handled or exception occurred and it is not handled or exception not occurred
 * finally should be written after catch blocks and should not be added in between
 * finally will work with try only
 * immediately after try catch should be written and there should not be any other code
 * 
 * 
 * Checked Exception:
 * can be handled using try and catch block
 * throws keyword
 * 
 */

public class ExceptionHandingDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program Started");
		System.out.println(" Enter the number: ");
		int no = sc.nextInt();
		try {
		System.out.println(100/no); // If you enter 0 will get arithmetic exception and this should be handled
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Data---------> \n"+e);
		}
		catch(Exception e) {
			System.out.println("Uncatched Exception Data---------> \n"+e);
		}
		finally{
			sc.close();
			System.out.println("Final code block");
		}
		System.out.println("Program Ended");
		System.out.println("Program Exited");
	}

}
