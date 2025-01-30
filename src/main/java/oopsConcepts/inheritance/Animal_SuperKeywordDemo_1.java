package oopsConcepts.inheritance;

public class Animal_SuperKeywordDemo_1 {
	
	Animal_SuperKeywordDemo_1(){ //Constructor invoked using super
		System.out.println(" Animal is created ");
	}

	
	String color = "White"; // Color for super keyword
	void eating() {
		System.out.println(" Eating using super keyword ");
	}
	
	
}

class Dog extends Animal_SuperKeywordDemo_1{
	
	Dog(){
		super();
		System.out.println(" Dog is barking inside Dog method ");
		
	}
	
	String color = "Black";
	
	void displayColor() {
		System.out.println(" Color from displaycolor method : "+color);
		System.out.println(" Color using super keyword : "+super.color);
	}
	
	void eating() {
		System.out.println(" Eating Bread");
		super.eating(); //Calling method using super keyword
	}
	
	
	
}
