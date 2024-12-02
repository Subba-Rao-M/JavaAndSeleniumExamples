package controlStatemens;

public class WhileLoopDemo {
	
	/****
	 * INitilization, condition and increment or decrement 
	 * Important to iterate over data
	 *  
	 * ******/
	

	public static void main(String[] args) {
		//Example Print 1 to 10
		
		int i = 1; // Initialization
		
		while (i<=10) { //Condition
			System.out.println("value of i "+i); // Statement
			i++; //Increment operator
		}
		
		// At same point above condition should become false, else it will go on infinite loop
		
		
		//Example 2: Pint hello message 10 times
		
		int a=1;
		
		while (a<=10) {
			System.out.println("Hello ");
			a++;
		}
		
		
		// Example 3: Print even numbers between 1 to 10
		
		int b = 2;
		
		while (b<=10) {
			System.out.println("Value of b "+b);
			b+=2;
		}
		
		
		//Example 4: Approach 2
		
		int c=1;
		
		while(c<=10) {
			if(c%2==0) {
				System.out.println("Even Number c is "+c);
			}
			c++;
		}
		
		
		
		//Example 5: Print 1 to 10 with even or odd number
		
	int d=1;
		
		while(d<=10) {
			if(d%2==0) {
				System.out.println(d+" Even Number");
			}
			else {
				System.out.println(d+" Odd Number");
			}
			d++;
		}
		
		
		//Example 5: Display the value 10 to 1 in decrement order
		
		int e = 10;
		
		while(e>=1) {
			System.out.println("value is "+e);
			e--;
		}

	}

}
