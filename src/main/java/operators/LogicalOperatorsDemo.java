package operators;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		/****
		 * Logical Operators : && , || and !
		 * Used with conditional statements
		 * Return true or false
		 * Relational work can work with only two variables and data type can be anything
		 * Logical operator work only with boolean variables with true or false conditions
		 * && will return true only both values are true
		 * || will return true if any one value is true
		 * ! i.e Negation will change the value from true to false
		 * ****/
		
		
		boolean x = true;
		boolean y = true;
		boolean x1 = false;
		boolean y1 = false;
		
		System.out.println(x && y);
		System.out.println(x && x1);
		System.out.println(x1 && x);
		System.out.println(x1 && y1);
		
		
		System.out.println(x || y);
		System.out.println(x || x1);
		System.out.println(x1|| x);
		System.out.println(x1|| y1);
		
		System.out.println(!x);
		System.out.println(!y1);
		
		boolean b1 = 10>20;
		
		System.out.println(b1);
		
		boolean b2 = 20>10;
		
		System.out.println(b2);
		
		
		System.out.println(b1&&b2); // false
		System.out.println(b1||b2); // true
		System.out.println(!b1 && b2); // true
		
		System.out.println((10<20) && (20>10)); // true
	}

}
