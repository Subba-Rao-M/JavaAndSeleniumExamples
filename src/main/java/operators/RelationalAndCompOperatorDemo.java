package operators;

public class RelationalAndCompOperatorDemo {
	/***********
	 * Relation or Comparison Operator : >, >=, <, <=, != and ==
	 * This operator will always return boolean value true or false
	 */
	
	public static void main(String[] args) {
	int a=10, b=20, x=10, y=20;
	
	
	System.out.println("A>B "+(a>b));
	System.out.println("A<B "+(a<b));
	
	System.out.println("B<=Y "+(a<=y));
	System.out.println("X>=A " +(x>=a));
	
	System.out.println("B!=Y "+(b!=y));
	
	System.out.println("B==Y "+(b==y));
	
	boolean result = a>b;
	System.out.println("Result "+result);
	
	result = a<y;
	System.out.println("Result "+result);
	
	
	}
}
