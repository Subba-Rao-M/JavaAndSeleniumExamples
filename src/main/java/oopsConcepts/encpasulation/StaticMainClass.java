package oopsConcepts.encpasulation;

public class StaticMainClass {

public static void main(String[] args) {
		
		System.out.println(StaticKeyWordDemo.a); // Specify class name if static variable in another class
		StaticKeyWordDemo.m1();
		
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
