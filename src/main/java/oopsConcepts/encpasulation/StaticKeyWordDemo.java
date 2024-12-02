package oopsConcepts.encpasulation;

public class StaticKeyWordDemo {
	
	static int a = 10; //static variable
	int b = 20; // Non-static  variable
	
	static void m1() {
		System.out.println("M1 - This is static method");
	}
	
	void m2() {
		System.out.println("M2 - This is non static method");
	}
	
	void m() { // Non-static method
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		/*
		System.out.println(b); // Non static variable and method gives
		m2();
		*/
		StaticKeyWordDemo sk = new StaticKeyWordDemo();
		sk.b=20;
		sk.m2();
		
		
		sk.m();
		
	}

}
