package oopsConcepts.inheritance;

public class StaticDemo {
	/***
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Instance variable
	String name;
	String address;
	static String city = "Bengaluru"; // variable is common and static all static variables are class variables
	//all objects will share same static variable
	//static block - all variables inside this are static block
	static {
		int a=0;
		String country = "India";
	}
	
	StaticDemo(String name, String address){ //Local variable
		this.name = name;
		this.address = address;
		//this.city = city;		
		
	}
	
	public String getAddress() {
		System.out.println(address + city);
		return address;
	}
	
	public static String getCity() {
		System.out.println("Can acceess only static variables"+city);
		return city;
	}

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo("Subba", "Anjanapura");
		StaticDemo sd1 = new StaticDemo("Subba", "Jayanagar");
		//If one more object is created instant variable value will be changed
		sd.getAddress();
		sd1.getAddress();
		//sd.getCity();
		System.out.println("Static variable and method");
		StaticDemo.getCity();
		System.out.println(StaticDemo.city);

	}

}
