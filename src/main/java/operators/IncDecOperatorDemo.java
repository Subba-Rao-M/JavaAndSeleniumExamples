package operators;

public class IncDecOperatorDemo {
	/***
	 * Increment and Decrement Operator: ++ and --
	 * 
	 */

	public static void main(String[] args) {
		//Scenario 1
		int a=10;
		
		System.out.println("Value "+a);
		
		a=a+1;
		System.out.println("Plus Value "+a);
		
		a++; // a = a+1
		System.out.println("Increment Value "+a);
		
	
		
		// Scenario 2 - Post Increment Operation-- First assign the value and then increment
		int b = 100;
		System.out.println("Initial Value "+b);
		
		int result = b++; // First b will assign value to result and then increment  its value is called post increment
		System.out.println("Result Value "+result);
		System.out.println("Post Increment Value "+b);
		
		// Scenario 3 - Pre Increment Operation -- First increment the value and then assign the value
		System.out.println("Initial Value "+b);
		
		result = ++b; // First b will increment and then assign the value to result
		System.out.println("Result Value "+result);
		System.out.println("Post Increment Value "+b);
		
		//Scenario 4 - Decrement Values	
		
		a= a-1;
		System.out.println("Minus Value "+a);
		a--;
		System.out.println("Decrement Value "+a);

		// Scenario 2 - Post Increment Operation-- First assign the value and then increment
		int c = 200;
		System.out.println("Initial Value "+c);
		
		int result1 = c--; // First c will assign value to result and then decrement  its value is called post increment
		System.out.println("Result Value "+result1);
		System.out.println("Post Decrement Value "+c);
		
		// Scenario 3 - Pre Increment Operation -- First decrement the value and then assign the value	
		result = --c; // First b will decrement and then assign the value to result
		System.out.println("Result Value "+result1);
		System.out.println("Post Increment Value "+c);
		
		

	}

}
