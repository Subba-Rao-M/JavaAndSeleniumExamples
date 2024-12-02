package oopsConcepts.constructors;

public class BoxMain {

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println(b.volume());
		//Cannot use b for crating object once again
		
		Box b1 = new Box(3.5, 4.6, 7);
		System.out.println(b1.volume());
		
		Box b3 = new Box(10.5);
		System.out.println(b3.volume());
		
		Box b4 = new Box(2, 4, 8);
		System.out.println(b4.volume());
		
		//Overloading is related to polymorphism

	}

}
