package oopsConcepts.inheritance;


class A // this cannot have access modifier, one file can have only one public class
{
	int a = 100;
	
	void display() {
		System.out.println(a);
	}
}


class B extends A
{
	int b = 200;
	
	void show() {
		System.out.println(b);
	}
}

class C extends B
{
	int c = 300;
	
	void print() {
		System.out.println(c);
	}
}


public class InheritanceClass {

	public static void main(String[] args) {
		
		//Single INherritance B able acquire Data from A
		 B b = new B();
		 System.out.println(b.a);
		 b.display();
		 
		 //Multi level inheritance A -> B - > C =(A+B)
		 
		 C c = new C();
		 System.out.println(c.a);
		 c.display();
		 c.show();

	}

}
