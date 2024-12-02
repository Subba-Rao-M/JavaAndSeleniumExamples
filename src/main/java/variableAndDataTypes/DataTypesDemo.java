package variableAndDataTypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		//Numeric Data Types
		
		int a=100;
		int b=200;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println(a+b);
		System.out.println("Sum of "+a+" And "+b+" Is "+a+b); // Wrong value because java confused with concatenation
		System.out.println("Sum of "+a+" And "+b+" Is "+(a+b));
		
		byte c= 125; // Enter more than 127 to see error
		System.out.println("Value of byte C is "+c);
		
		short d= 3535;
		System.out.println("Value of short d is "+d);
		
		long e= 353523899;
		System.out.println("Value of short d is "+e);
		
		long f= 3535238992348923479L; // L/l is literal used for long if more numbers
		System.out.println("Value of short d is "+f);
		
		
		//Decimal Numbers
		
		float f1 = 15.5f; // f/F is literal for float
		System.out.println("Float value"+f1);
		
		double f2=25.5;
		System.out.println("Float value"+f2);
		
		//Char data type
		
		char letter = 'a';
		System.out.println("Character value"+letter);
		
		//char ch = 'ABC'; //Invalid 
		//String ch = 'ABC'; //Invalid 
		//String ch = 'A'; //Invalid 
		//String ch = "A"; //Valid 
		
		//String data types
		String letters = "abcd";
		System.out.println("String values"+letters);
		
		//Boolean values
		
		boolean available = true;
		System.out.println(" Available "+available);
		
		available = false;
		//available = "false"; //invalid
		//String available = false; //invalid
		//String available = "false"; //valid
		System.out.println(" Available "+available);
	}

}
