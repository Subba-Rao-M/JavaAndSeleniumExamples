package typecasting;

class Animal{ }

class Dog extends Animal {}

class Cat extends Animal {}


/**
 * 3 rules for typecasting
 * 
 * 
 */

public class TypeCastingDemo_2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal an = new Dog();
		Cat ct = (Cat) an; // after converting an to cat it becomes equal to cat
		// A b = C 	d
		
		/**
		 * 3 rules for typecasting
		 * 1) Is there any relationship between objects getting converting i.e ct and an should have relationship
		 * D and C must have some relationship
		 * 
		 * 2) Assignment is valid or not i.e Cat must be same as animal or cat must be less than animal or cat
		 * C must be same or Child of A
		 * 
		 * 3) The underlying oject type of D must be same as or child of C
		 * 
		 * 
		 *  For rule1 and 2 there will compile time error
		 *  For rule 3 there will be run time error
		 */

		Dog dg = new Dog();
		//Cat ct1 = (Cat) dg; // invalid as per rule 1
		
		Animal an1 = new Dog();
		//Cat ct1 = (Dog) an1; 
		//Animal is having relationship with DOg rule 1 is passed
		//Invalid as DOg is not similar or equal to Cat or greater than cat(Animal) i.e rule 2 failed
		
		Cat cd1 = (Cat) an1; //run time error as Cat and an i.e Dog class is not same as Cat //Run time error
		
		
		Dog dg1 = (Dog) an1; // ALl three rules passed
		
		

	}

}
