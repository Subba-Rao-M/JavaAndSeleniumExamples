package wrapperclasses;

import java.util.ArrayList;

/**
 *
 */


public class WrapperClassDemo {

	@SuppressWarnings({ "removal", "unused", "rawtypes" })
	public static void main(String[] args) {
		 String s = "welcome";
		 String s1 = new String("Welcome"); // String as object
		 
		 int x = 100;
		 
		//  int x1 = new int(100); // Not allowed this in primitive data type
		 /* For every primitive data type there is a wrapper class available to create object
		  * int - Integer
		  * float - Float
		  * double - Double
		  * char - Character
		  * booolean - Boolean
		  * 
		  * Advantages:
		  * Can create variable in object format
		  * Can convert one type into another data type
		  * 
		  * Use: Data convertion from one format to another using builtin method
		  * 
		  */
		 Integer x2 = new Integer(200);
		 
		 String p1 = "150.5";
		 String p2 = "145.2";
		 
		 System.out.println(p1+p2); // String results in concat
		 
		 /*Scenario 1 - Convert from String to Int, double, boolean
		  * Integer.parseInt(String Value)
		  * Double.parseDouble(String Value)
		  * Boolean.parseBoolean(String value)
		  * Character.parseCharacter(String Value) - Not allowed since we cannot convert multiple to single char
		  * 
		  */
		 
		 
		 Double p11 = Double.parseDouble(p1);
		 Double p22 = new Double(p2);
		 System.out.println(p11+p22);
		 
		 String i = "100";
		 System.out.println(Integer.parseInt(i));
		 
		// String i1 = "100test";
		// System.out.println(Integer.parseInt(i1)); // Not allowed
		 
		 String status = "true";
		 System.out.println(Boolean.parseBoolean(status)); // Use only if string value has true or false value, if other values used false will be returned
		 
		// Scenario 2 - Convert from Int, Double, Char (primitive type) to String
		 // String is not wrapper class
		 // it has method String.valueOf(data) - converts all primitive data to string format
		 
		 int a = 10;
		 double b = 10.5;
		 boolean stat = true;
		 char c = 'A';
		 
		 System.out.println(String.valueOf(a));
		 System.out.println(String.valueOf(b));
		 System.out.println(String.valueOf(c));
		 System.out.println(String.valueOf(stat));
		 
		 
		 ArrayList arr= new ArrayList(); //accepts heterogeneous data
		 ArrayList<Integer> a1 = new ArrayList<Integer>(); //Integer wrapper class added to make list data type as integer
		// ArrayList<int> a1 = new ArrayList<int>(); // Not valid
		 //IN collection wrapper classes uses extensively
	}

}
