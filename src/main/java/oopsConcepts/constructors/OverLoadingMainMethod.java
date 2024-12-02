package oopsConcepts.constructors;

public class OverLoadingMainMethod {
	
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main(int x, int y) {
		System.out.println(x+y);
	}
	
	void main(String s) {
		System.out.println("Hello "+s);
	}

	public static void main(String[] args) { // when executing this class from command prompt main method can accept String array type of parameters
		OverLoadingMainMethod om = new OverLoadingMainMethod();
		om.main(100);
		om.main(122, 11111);
		om.main("Subba");
	}

}
