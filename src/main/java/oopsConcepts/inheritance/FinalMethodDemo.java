package oopsConcepts.inheritance;

/*final*/ class Test_1{
	
	void m1() {
		System.out.println("M1 method");
	}
	
	final void m2() { //Cannot override this method
		System.out.println("M2 method");
	}
}

class Test_2 extends Test_1{
	
	void m1() {
		System.out.println("M1 method");
	}
	
	/*
	void m2() { //Cannot override method with final keyword
		System.out.println("M2 method");
	}
	*/
}


public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
