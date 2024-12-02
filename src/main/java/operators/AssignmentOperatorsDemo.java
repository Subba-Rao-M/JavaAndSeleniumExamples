package operators;

public class AssignmentOperatorsDemo {
	
	/*****
	 * Assignment Operator: =, +=, -=, *=, /= and %=
	 * Also called short hand assignment operator
	 * These operators will increment or decrease values by more than 1+= and -=
	 */

	public static void main(String[] args) {
		int a = 10;
		System.out.println("Original Value of a -> "+a);
		a = a+5; 
		System.out.println("Value of a=a+5 -> "+a);
		
		a+=5; // a=a+5
		System.out.println("Value of a+=5 - > "+a);
		
		a-=5; // a = a-5
		System.out.println("Value of a-=5 - > "+a);
		
		a*=5; // a= a*5
		System.out.println("Value of a*=5 - > "+a);
		
		a/=5; // a= a/5
		System.out.println("Value of a/=5 - > "+a);
		
		a%=2; // a= a%2
		System.out.println("Value of a%=2 - > "+a);

	}

}
