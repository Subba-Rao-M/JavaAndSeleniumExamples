package methodsDemo;

public class ConstructorDemo {
	int x,y;
	
	//Default constructor
	ConstructorDemo(){
		x=100;
		y=200;
	}
	
	//Parameterized constructor
	
	ConstructorDemo(int a, int b){
		x=a;
		y=b;
	}

	
	// performing action will be in method
	void sum() {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		cd.sum();
		ConstructorDemo cd1 = new ConstructorDemo(100, 500);
		cd1.sum();

	}

}
