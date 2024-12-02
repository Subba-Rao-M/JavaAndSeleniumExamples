package operators;

public class ArithMeticOperatorsDemo {
	
	/**************
	 * Arithmetic Operators : +, -, *, / and % 
	 * Arithmetic operators works only on numeric type of data
	 * @param args
	 */

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Sum of a and b is "+(a+b));
		System.out.println("Diff of a and b is "+(a-b));
		System.out.println("Diff of b and a is "+(b-a));
		System.out.println("Multiplication of a and b is "+(a*b));
		System.out.println("Div of a and b is "+(a/b));
		System.out.println("Div of b and a is "+(b/a));
		System.out.println("Modular of a and b is "+(a%b)); // Will return reminder value
		
		int c=22;
		System.out.println("Modular of a and c is "+(a%c)); 
		System.out.println("Modular of c and a is "+(c%a));
		System.out.println("Modular of c and c is "+(c%c));
	}

}
