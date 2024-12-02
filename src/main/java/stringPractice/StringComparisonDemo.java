package stringPractice;

public class StringComparisonDemo {

	public static void main(String[] args) {
		
		//Example 1
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Example 2
		String a1 = new String("welcome");
		String a2 = new String("welcome");
		System.out.println("A1"+a1);
		System.out.println("A2"+a2);
		
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //true
		
		/****
		 * == Is used to compare the objects
		 * equals() is used to compare the values of objects
		 * new keyword created the objects i.e a1 and a2 are different objects
		 */
		
		
		//Example 3
				String c1 ="welcome";
				String c2 = new String("welcome");
				System.out.println("C1"+c1);
				System.out.println("C2"+c2);
				
				System.out.println(c1==c2); //false
				System.out.println(c1.equals(c2)); //true
				
				//Example 4 -- when the objects becomes equal
				String d1 ="welcome";
				String d2 = new String("welcome");
				String d3 = d2; // Assign the object value to d3
				System.out.println("D1"+d1);
				System.out.println("D2"+d2);
				System.out.println("D3"+d3);
				System.out.println(d1==d2); //false
				System.out.println(d1.equals(d2)); //true
				
				System.out.println(d2==d3); //true
				System.out.println(d2.equals(d3)); //true
				
				
				System.out.println(d1==d3); //true
				System.out.println(d1.equals(d3)); //true
			
		
	}

}
