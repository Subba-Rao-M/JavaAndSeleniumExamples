package operators;

public class ConditonalTernaryDemo {
	
	/*****
	 * Conditional or Ternary Operator: ?:
	 * 
	 * Syntax = > dataType var = (expression) ? result1 : result2;
	 * 
	 */

	public static void main(String[] args) {
		
		// Example 1
		
		int a = 200, b = 100;
		
		
		int result = a<b ? a : b;  // If expression value is true a will be assinged to result and if it is false b will be assigned
		
		System.out.println(result);
		
		
		//Example 2
		
		int x = (1==1) ? 100 :200;
		System.out.println(x);
		
		//Example 3
		
		x = (1==2) ? 100 :200;
		System.out.println(x);
		
		
		
		//Example 4
		
		int age = 30;
		
		boolean eligible = (age> 18) ? true : false;
		System.out.println(eligible);
		
		//Example 5
		
		age = 15;
		String sEligible = (age > 18) ? "Eligible" : "Not Eligible";
		System.out.println(sEligible);
		
		
		
	}
	

}
