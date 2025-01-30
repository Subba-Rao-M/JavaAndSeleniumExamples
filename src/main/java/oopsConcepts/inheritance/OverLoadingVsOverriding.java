package oopsConcepts.inheritance;
/****
 * 
 * 
 * 
 * 
 */

class X1 {
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class Y1 extends X1{
	
	void m1(int a) { // Overiding
		System.out.println(a*a); 
	}
	
	void m2(int b) { //Overriding
		System.out.println(b*10);
	}
	
	void m2(int b, int c) { // Overloading
		System.out.println(b+c);
	}
	
}


public class OverLoadingVsOverriding {

	public static void main(String[] args) {
		
		X1 x1 = new X1();
		x1.m1(10);
		x1.m2(20);
		
		Y1 y1 = new Y1();
		y1.m1(30);
		y1.m2(50);
		y1.m2(40, 15);
		

	}

}
