package typecasting;

/**
 * Typecasting - converting type of data
 * Upcasting - Widening - converting data from smaller to larger ex: int to long, float to double
 * DownCasting - Narrowing - larger to smaller - ex: long to int
 * Both applicable for primitive data types and objects
 * 
 */
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Upcasting - small to high - automatic process
		
		int intvalue = 100;
		int longvalue = intvalue; // no restriction in memory
		System.out.println(longvalue);
		
		float floatvalue = 10.5F;
		float doubleValue = floatvalue;
		System.out.println(doubleValue);
		
		//Downcasting - high to small - manual coding
		
		long lvalue = 812737891;
		int ivalue = (int) lvalue; //extra memory required
		System.out.println(ivalue);
		
		double dvalue = 1012310.11123123;
		float fvalue = (float) dvalue;
		System.out.println(fvalue);
		
		int i = 100;
		double d = i; //Upcasting
		System.out.println(d);
		
		double d1 = 10.5;
		int i1 = (int) d1; //Downcasting
		System.out.println(i1); // Decimal value is truncated and data lost
		

	}

}
