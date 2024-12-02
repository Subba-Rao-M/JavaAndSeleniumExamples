package oopsConcepts.inheritance;



class Parent{
	int a;
	void display() {
		System.out.println("Inside Parent : "+a);
	}
	
}

class Child1 extends Parent{
	int x;
	void display1() {
		System.out.println("Inside Child 1 : "+x);
	}
	
}

class Child2 extends Parent{
	int y;
	void display2() {
		System.out.println("Inside Child 2 : "+y);
	}
	
}
public class HierachyinheritanceDemo {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.a = 100;
		c1.x = 200;
		c1.display();
		c1.display1();
		
		
		Child2 c2 = new Child2();
		c2.a = 100;
		c2.y = 800;
		c2.display();
		c2.display2();

	}

}
