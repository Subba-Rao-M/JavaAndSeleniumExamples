package oopsConcepts.dataabstracttion;


interface Shape{
	int length = 10; // by default final and static variables
	int width = 30;
	
	default void square(){ // default method
		System.out.println("Default Method");
	}
	
	static void rectangle(){ // static method
		System.out.println("Static Method");
	}
	
	void circle(); // abstract method and by default considers public access modifier
	
}

public class InterfaceDemo implements Shape{
	
	public void circle() { // default access modifier by default and above interface has public access modifier and now it is reducing access. SO add public for this.
		System.out.println(" THis is circle - Abstract method");
	}
	
	public void trainge(){ // Class method
		System.out.println("Trainage Class Method");
	}

	public static void main(String[] args) {
		
		//Scenario 1: Using class object reference and instantiation
			
		InterfaceDemo id = new InterfaceDemo(); 
		id.circle(); // abstract method
		id.square(); // default method
		//rectanle(); // static method
		Shape.rectangle(); //INterfaceName.method for static method
		id.trainge();
		
		//Scenario 2
		
		//Shape s = new Shape(); // Not allowed
		
		//SCenario 3 : Using interface for object reference and class instantiation
		
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		//sh.triangle(); // Not possible since it is not part of interface
		System.out.println(sh.length);
		System.out.println(Shape.length*Shape.width);
		
		// Class variables cannot be used with sh

	}

	

}
