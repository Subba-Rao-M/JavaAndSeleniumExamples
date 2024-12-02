package polymorphism;

public class MethodOverLoadingAdder {
	
	int a=20, b=30;
	
	void add() {
		System.out.println(a+b);
	}
	
	void add (int x, int y) { // with parameter
		System.out.println(x+y);
	}
	
	void add (int x, double y) { // data type different
		System.out.println(x+y);
	}
	
	void add (double y, int x) { // order of parameter
		System.out.println(x+y);
	}
	

	
}
