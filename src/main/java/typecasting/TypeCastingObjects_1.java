package typecasting;

class Parent{
	String name = "Test";
	void m1() {
		System.out.println("Inside method M1");
	}
}

class Child extends Parent{
	int id = 101;
	void m2() {
		System.out.println("Inside method M2");
	}
}

public class TypeCastingObjects_1 {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		
		Parent p = new Child(); //Up casting
		System.out.println(p.name);
		p.m1();
		
		
		
		//Child variable and method cannot access even though object created for child
	//	System.out.println(p.id);
		//p.m2();
		
		//Child jr = new Parent(); //Down casting by assigning parent to child not possible direclty
		
		Parent pt = new Parent();
		Child jr1 = (Child) pt; //Down casting by assigning pt object
		
		System.out.println(jr1.id);
		jr1.m1();
		System.out.println(jr1.name);
		jr1.m2();
		
		//Above results in java.lang.ClassCastException during run time even though there was no error from compile time
		// Child jr1 is less than pt
		
		
		//If dont know what type of data is returning use object else use specific data type
		//Object is parent of all classes
	}

}
