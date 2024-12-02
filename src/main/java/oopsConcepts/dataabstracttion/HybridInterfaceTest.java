package oopsConcepts.dataabstracttion;

//Class 

///                         Class   /// C or I -- Inerface cannot be used to extend as duplicated scenario and interface cannot implement class 

///					I1					I2

///							Class 2 // Class 2 implements I1 and I2 and extends C1


// combination of hierachy and multiple inheritance

class Test{
	
	int z=200;
	void test1() {
		System.out.println("System out method from Test Class");
	}
}
interface ABC1{
	int x=100;
	void m1();
}

interface XYZ1{
	int y=200;
	void m2();
}

public class HybridInterfaceTest extends Test implements ABC1, XYZ1 {
	
	public void m1() {
		System.out.println("System M1"+x);
	}
	
	public void m2() {
		System.out.println("System M2"+y);
	}

	public static void main(String[] args) {
		HybridInterfaceTest hit = new HybridInterfaceTest();
		hit.m1();
		hit.m2();
		hit.test1();

	}



}
