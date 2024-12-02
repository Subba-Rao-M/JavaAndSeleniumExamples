package oopsConcepts.dataabstracttion;

public class C1 extends C2 implements I1, I2 { // multiple inheritance
	

	public static void main(String[] args) {
		//Scenario 1
		C1 c1 = new C1();
		c1.m1();
		c1.m2();
		c1.m3();
		
		//SCenario 2
		I1 i1 = new C1();
		i1.m1();
		
		//Scenario 3
		
		I2 i2 = new C1();
		i2.m2();

	}

	@Override
	public void m2() {
		System.out.println("M2 method from I2");
		System.out.println(I2.y);
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method from I1");
		System.out.println(I1.x);
		
	}

}
